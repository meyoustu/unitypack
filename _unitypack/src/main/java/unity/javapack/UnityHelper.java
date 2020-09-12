package unity.javapack;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("Only provide to unity.")
public final class UnityHelper {

  private UnityHelper() {}

  public static Class<?> getUnityPlayerClass() {
    try {
      return Class.forName("com.unity3d.player.UnityPlayer");
    } catch (ClassNotFoundException e) {
      return null;
    }
  }

  public static <T extends Activity> T getUnityPlayerCurrentActivity(Class<T> classOfT) {
    Class<?> unityPlayerClass = getUnityPlayerClass();
    if (null != unityPlayerClass) {
      try {
        Field currentActivityField = unityPlayerClass.getDeclaredField("currentActivity");
        return classOfT.cast(currentActivityField.get(unityPlayerClass));
      } catch (NoSuchFieldException e) {
        return null;
      } catch (IllegalAccessException e) {
        return null;
      }
    } else {
      return null;
    }
  }

  public static Activity getUnityPlayerCurrentActivity() {
    return getUnityPlayerCurrentActivity(Activity.class);
  }

  public static void currentActivityRunOnUiThread(Runnable runnable)
      throws CurrentActivityNotFoundException {
    try {
      Activity currentActivity = getUnityPlayerCurrentActivity();
      if (null != runnable) {
        if (null != currentActivity) {
          getUnityPlayerCurrentActivity().runOnUiThread(runnable);
        } else {
          throw new CurrentActivityNotFoundException("null == currentActivity");
        }
      }
    } catch (Throwable tr) {
      throw new CurrentActivityNotFoundException(tr);
    }
  }

  public static FrameLayout mUnityPlayer;

  static {
    try {
      Activity currentActivity = getUnityPlayerCurrentActivity();
      if (null != currentActivity) {
        Field _mUnityPlayer = currentActivity.getClass().getDeclaredField("mUnityPlayer");
        if (null != _mUnityPlayer) {
          _mUnityPlayer.setAccessible(true);
          mUnityPlayer = (FrameLayout) _mUnityPlayer.get(currentActivity);
        } else {
          mUnityPlayer = null;
        }
      } else {
        mUnityPlayer = null;
      }
    } catch (IllegalAccessException e) {
      if (BuildConfig.DEBUG) {
        UnityLogger.e("unity.javapack.UnityHelper", e);
      }
    } catch (NoSuchFieldException e) {
      if (BuildConfig.DEBUG) {
        UnityLogger.e("unity.javapack.UnityHelper", e);
      }
    }
  }

  // Inject
  public static void addViewToUnityPlayer(final View view) {
    if (null != mUnityPlayer && null != view) {
      try {
        currentActivityRunOnUiThread(
            new Runnable() {
              @Override
              public void run() {
                mUnityPlayer.addView(view);
              }
            });
      } catch (CurrentActivityNotFoundException e) {
        if (BuildConfig.DEBUG) {
          UnityLogger.e("unity.javapack.UnityHelper", e);
        }
      }
    }
  }

  public static <T extends View> T newView(Class<T> classOfT) {
    if (null != classOfT) {
      try {
        return classOfT
            .getDeclaredConstructor(Context.class)
            .newInstance(getUnityPlayerCurrentActivity());
      } catch (IllegalAccessException e) {
        return null;
      } catch (InstantiationException e) {
        return null;
      } catch (InvocationTargetException e) {
        return null;
      } catch (NoSuchMethodException e) {
        return null;
      }
    } else {
      return null;
    }
  }
}
