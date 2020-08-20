package unity.javapack.widget;

import android.util.AttributeSet;

import static com.unity3d.player.UnityPlayer.currentActivity;

public final class CheckBox extends android.widget.CheckBox {
  public CheckBox() {
    super(currentActivity);
  }

  public CheckBox(AttributeSet attrs) {
    super(currentActivity, attrs);
  }

  public CheckBox(AttributeSet attrs, int defStyleAttr) {
    super(currentActivity, attrs, defStyleAttr);
  }

  //  @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  //  public CheckBox( AttributeSet attrs, int defStyleAttr, int defStyleRes) {
  //    super(currentActivity, attrs, defStyleAttr, defStyleRes);
  //  }
}
