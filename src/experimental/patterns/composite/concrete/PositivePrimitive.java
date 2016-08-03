package experimental.patterns.composite.concrete;

import experimental.patterns.composite.base.BasePrimitive;

/**
 * Used to define a standard value leaf
 * Created by liamdg on 4/08/16.
 */
public class PositivePrimitive extends BasePrimitive {

    public PositivePrimitive(final double value) {
        super(value);
    }

    @Override
    public Double evaluateComponent() {
        return value;
    }
}
