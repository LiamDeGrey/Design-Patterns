package experimental.patterns.template_java8;

/**
 * Created by liamdg on 26/08/16.
 */
public class LoggingThread extends Thread implements Logger {
    private static final int ERROR_PROFILE_UNAVAILABLE = 600;//custom error codes to listen for
    private static final int ERROR_PROFILE_BELOW_MINIMUM_AGE = 601;

    public LoggingThread() {

    }


    @Override
    public void run() {

    }

    @Override
    public void onSuccess(final int statusCode) {
        final String errorMessage;
        switch (statusCode) {
            case ERROR_PROFILE_UNAVAILABLE:
                errorMessage = "Sorry, this profile is currently unavailable.";
                break;
            case ERROR_PROFILE_BELOW_MINIMUM_AGE:
                errorMessage = "Sorry, but this profile is restricted to older users.";
                break;
            default:
                Logger.super.onError(statusCode);
                return;
        }
        logMessage(errorMessage);
    }

    @Override
    public void onError(final int statusCode) {
        final String errorMessage;
        switch (statusCode) {
            case ERROR_PROFILE_UNAVAILABLE:
                errorMessage = "Sorry, this profile is currently unavailable.";
                break;
            case ERROR_PROFILE_BELOW_MINIMUM_AGE:
                errorMessage = "Sorry, but this profile is restricted to older users.";
                break;
            default:
                Logger.super.onError(statusCode);
                return;
        }
        logMessage(errorMessage);
    }

    @Override
    public void logMessage(final String message) {
        System.out.println(LoggingThread.class.getSimpleName().concat(message));
    }
}
