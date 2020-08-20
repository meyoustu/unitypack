package unity.javapack.widget;

import android.util.AttributeSet;

import static com.unity3d.player.UnityPlayer.currentActivity;

public final class Button extends android.widget.Button {
  public Button() {
    super(currentActivity);
  }

  public Button(AttributeSet attrs) {
    super(currentActivity, attrs);
  }

  public Button(AttributeSet attrs, int defStyleAttr) {
    super(currentActivity, attrs, defStyleAttr);
  }

  //  @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  //  public Button(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
  //    super(currentActivity, attrs, defStyleAttr, defStyleRes);
  //  }
}
