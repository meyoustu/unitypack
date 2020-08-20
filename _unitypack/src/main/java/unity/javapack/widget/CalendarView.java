package unity.javapack.widget;

import android.util.AttributeSet;

import static com.unity3d.player.UnityPlayer.currentActivity;

public final class CalendarView extends android.widget.CalendarView {
  public CalendarView() {
    super(currentActivity);
  }

  public CalendarView(AttributeSet attrs) {
    super(currentActivity, attrs);
  }

  public CalendarView(AttributeSet attrs, int defStyleAttr) {
    super(currentActivity, attrs, defStyleAttr);
  }

  //  @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
  //  public CalendarView(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
  //    super(currentActivity, attrs, defStyleAttr, defStyleRes);
  //  }
}
