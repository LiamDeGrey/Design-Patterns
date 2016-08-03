package experimental.patterns.composite.concrete;

import experimental.patterns.composite.base.BaseComponent;
import experimental.patterns.composite.base.BaseComposite;

/**
 * Used to multiply multiple componenets together
 * Created by liamdg on 4/08/16.
 */
public class MultiplyComposite extends BaseComposite {

    public MultiplyComposite(final BaseComponent... children) {
        super(children);
    }

    @Override
    public Double evaluateComponent() {
        double value = 1.0;
        for (final BaseComponent component : children) {
            value *= component.evaluateComponent();
        }
        return value;
    }
}
