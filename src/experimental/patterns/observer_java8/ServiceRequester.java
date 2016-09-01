package experimental.patterns.observer_java8;

/**
 * Created by liamdg on 25/08/16.
 */
public class ServiceRequester {
    private ErrorObserver errorObserver;

    public ServiceRequester(final ErrorObserver errorObserver) {
        this.errorObserver = errorObserver;
    }

    public void triggerError(final int statusCode) {
        onError(statusCode);
    }

    private void onError(final int statusCode) {
        if (errorObserver != null) {
            errorObserver.onError(statusCode);
        }
    }
}
