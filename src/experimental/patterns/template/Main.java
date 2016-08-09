package experimental.patterns.template;

import java.util.Locale;

import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Template Method";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final Animal dog = new Dog();
        final Animal monkey = new Monkey();

        final boolean correct =
                dog.getNumberOfLegs() == 4 &&
                        monkey.getNumberOfLegs() == 2;

        System.out.println("Template method works? " + correct);
    }
}
