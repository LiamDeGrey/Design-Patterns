package experimental.patterns.proxy;

import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Proxy";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);
    }
}
