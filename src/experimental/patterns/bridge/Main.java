package experimental.patterns.bridge;

import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Bridge";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final Shape selectedCircle = new Circle(0, 0, 20, new SelectedCircleDrawer());
        final Shape unselectedCircle = new Circle(0, 0, 20, new UnselectedCircleDrawer());

        selectedCircle.draw();
        unselectedCircle.draw();
    }
}
