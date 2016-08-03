package experimental.patterns.composite.concrete;

import experimental.patterns.composite.base.BasePrimitive;

/**
 * Used to define a negative leaf node
 * Created by liamdg on 4/08/16.
 */
public class NegativePrimitive extends BasePrimitive {

    public NegativePrimitive(final double value) {
        super(value);
    }

    @Override
    public Double evaluateComponent() {
        return -value;
    }
}
