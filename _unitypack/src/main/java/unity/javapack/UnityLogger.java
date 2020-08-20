package unity.javapack;

import android.util.Log;

@SuppressWarnings("Only provide to unity.")
public final class UnityLogger {

  private UnityLogger() {}

  private static final String TAG = "Unity";

  public static int v(String msg) {
    return Log.v(TAG, msg);
  }

  public static int v(String msg, Throwable tr) {
    return Log.v(TAG, msg, tr);
  }

  public static int d(String msg) {
    return Log.d(TAG, msg);
  }

  public static int d(String msg, Throwable tr) {
    return Log.d(TAG, msg, tr);
  }

  public static int i(String msg) {
    return Log.i(TAG, msg);
  }

  public static int i(String msg, Throwable tr) {
    return Log.i(TAG, msg, tr);
  }

  public static int w(String msg) {
    return Log.w(TAG, msg);
  }

  public static int w(String msg, Throwable tr) {
    return Log.w(msg, tr);
  }

  public static boolean isLoggable(int level) {
    return Log.isLoggable(TAG, level);
  }

  public static int w(Throwable tr) {
    return Log.w(TAG, tr);
  }

  public static int e(String msg) {
    return Log.e(TAG, msg);
  }

  public static int e(String msg, Throwable tr) {
    return Log.e(TAG, msg, tr);
  }

  public static int wtf(String msg) {
    return Log.wtf(TAG, msg);
  }

  public static int wtf(Throwable tr) {
    return Log.wtf(TAG, tr);
  }

  public static int wtf(String msg, Throwable tr) {
    return Log.wtf(TAG, msg, tr);
  }

  public static String getStackTraceString(Throwable tr) {
    return Log.getStackTraceString(tr);
  }

  public static int println(int priority, String msg) {
    return Log.println(priority, TAG, msg);
  }
}
