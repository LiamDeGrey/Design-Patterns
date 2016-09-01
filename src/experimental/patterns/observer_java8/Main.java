package experimental.patterns.observer_java8;

import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Observer Java 8";

    //custom error codes to listen for
    private static final int ERROR_PROFILE_UNAVAILABLE = 600;
    private static final int ERROR_PROFILE_BELOW_MINIMUM_AGE = 601;

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        new Application();

        new ServiceRequester(new ErrorObserver() {
            @Override
            public void onError(final int statusCode) {
                switch (statusCode) {
                    case ERROR_PROFILE_UNAVAILABLE:
                        Application.getInstance().setError("Sorry, this profile is currently unavailable.");
                        break;
                    case ERROR_PROFILE_BELOW_MINIMUM_AGE:
                        Application.getInstance().setError("Sorry, but this profile is restricted to older users.");
                        break;
                    default:
                        ErrorObserver.super.onError(statusCode);
                        break;
                }
            }
        }).triggerError(400);
    }
}
