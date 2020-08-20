package unity.javapack.widget;

import android.content.res.Resources;
import android.os.Build;

import static com.unity3d.player.UnityPlayer.currentActivity;

public final class Toast {

  public static final int LENGTH_LONG = android.widget.Toast.LENGTH_LONG;
  public static final int LENGTH_SHORT = android.widget.Toast.LENGTH_SHORT;

  private android.widget.Toast toast;

  private Toast() {
    toast = new android.widget.Toast(currentActivity);
  }

  public void show() {
    toast.show();
  }

  public void cancel() {
    toast.cancel();
  }

  public void setDuration(int duration) {
    toast.setDuration(duration);
  }

  public int getDuration() {
    return toast.getDuration();
  }

  public void setMargin(float horizontalMargin, float verticalMargin) {
    toast.setMargin(horizontalMargin, verticalMargin);
  }

  public float getHorizontalMargin() {
    return toast.getHorizontalMargin();
  }

  public float getVerticalMargin() {
    return toast.getVerticalMargin();
  }

  public void setGravity(int gravity, int xOffset, int yOffset) {
    toast.setGravity(gravity, xOffset, yOffset);
  }

  public int getGravity() {
    return toast.getGravity();
  }

  public int getXOffset() {
    return toast.getXOffset();
  }

  public int getYOffset() {
    return toast.getYOffset();
  }

  public void addCallback(android.widget.Toast.Callback callback) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
      toast.addCallback(callback);
    }
  }

  public void removeCallback(android.widget.Toast.Callback callback) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
      toast.removeCallback(callback);
    }
  }

  public static android.widget.Toast makeText(CharSequence text, int duration) {
    return android.widget.Toast.makeText(currentActivity, text, duration);
  }

  public static android.widget.Toast makeText(int resId, int duration)
      throws Resources.NotFoundException {
    return android.widget.Toast.makeText(currentActivity, resId, duration);
  }

  public void setText(int resId) {
    toast.setText(resId);
  }

  public void setText(CharSequence s) {
    toast.setText(s);
  }
}
