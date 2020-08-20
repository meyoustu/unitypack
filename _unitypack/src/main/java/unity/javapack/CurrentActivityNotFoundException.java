package unity.javapack;

public final class CurrentActivityNotFoundException extends Exception {
  public CurrentActivityNotFoundException() {}

  public CurrentActivityNotFoundException(String message) {
    super(message);
  }

  public CurrentActivityNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public CurrentActivityNotFoundException(Throwable cause) {
    super(cause);
  }

  //  @android.support.annotation.RequiresApi(api = Build.VERSION_CODES.N)
  //  public UnityPlayerNotFoundException(
  //      String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
  //    super(message, cause, enableSuppression, writableStackTrace);
  //  }
}
