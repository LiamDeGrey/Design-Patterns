package experimental.patterns.template_java8;

import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Template Method Java 8";

    public static void main(final String[] args) {
        new Application();

        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);
    }
}
