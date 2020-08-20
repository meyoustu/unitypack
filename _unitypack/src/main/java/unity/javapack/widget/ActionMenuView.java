package unity.javapack.widget;

import android.annotation.SuppressLint;
import android.util.AttributeSet;

import static com.unity3d.player.UnityPlayer.currentActivity;

@SuppressLint("NewApi")
public final class ActionMenuView extends android.widget.ActionMenuView {
  public ActionMenuView() {
    super(currentActivity);
  }

  public ActionMenuView(AttributeSet attrs) {
    super(currentActivity, attrs);
  }
}
