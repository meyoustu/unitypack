package unity.javapack.widget;

import android.util.AttributeSet;

import static com.unity3d.player.UnityPlayer.currentActivity;

public final class CheckedTextView extends android.widget.CheckedTextView {

  public CheckedTextView() {
    super(currentActivity);
  }

  public CheckedTextView(AttributeSet attrs) {
    super(currentActivity, attrs);
  }

  public CheckedTextView(AttributeSet attrs, int defStyleAttr) {
    super(currentActivity, attrs, defStyleAttr);
  }

  //  @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  //  public CheckedTextView(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
  //    super(currentActivity, attrs, defStyleAttr, defStyleRes);
  //  }
}
