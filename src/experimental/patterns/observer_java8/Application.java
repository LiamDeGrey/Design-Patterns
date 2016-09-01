package experimental.patterns.observer_java8;

/**
 * Created by liamdg on 25/08/16.
 */
public class Application {
    private static Application instance;

    public Application() {
        instance = this;
    }

    public static Application getInstance() {
        return instance;
    }

    public void setError(final String errorMessage) {
        System.out.println(errorMessage);
    }
}
