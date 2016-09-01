package experimental.patterns.template_java8;

/**
 * Created by liamdg on 26/08/16.
 */
public class Application {
    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    public void setErrorMessage(final String message) {
        System.out.println("ERROR: ".concat(message));
    }

    public void setSuccessMessage(final String message) {
        System.out.println("SUCCESS: ".concat(message));
    }
}
