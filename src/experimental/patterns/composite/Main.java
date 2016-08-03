package experimental.patterns.composite;

import java.util.Locale;

import experimental.patterns.composite.concrete.AddComposite;
import experimental.patterns.composite.concrete.MultiplyComposite;
import experimental.patterns.composite.concrete.NegativePrimitive;
import experimental.patterns.composite.concrete.PositivePrimitive;
import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Composite";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        //Define primitive objects (Leafs)
        final PositivePrimitive value22 = new PositivePrimitive(22);
        final NegativePrimitive value43 = new NegativePrimitive(43);

        final PositivePrimitive value98 = new PositivePrimitive(98);
        final NegativePrimitive value12 = new NegativePrimitive(12);

        //Define composite objects (parents)
        final AddComposite addComponent = new AddComposite(value22, value43);
        final MultiplyComposite multiplyComponent = new MultiplyComposite(value98, value12);

        //Define root node to add them all together
        final AddComposite rootComponent = new AddComposite(addComponent, multiplyComponent);

        final double expectedResult = -1197;

        System.out.printf(Locale.getDefault(), "Program result should equal %.2f, actual result is %.2f", expectedResult, rootComponent.evaluateComponent());
    }
}
