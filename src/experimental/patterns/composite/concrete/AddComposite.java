package experimental.patterns.composite.concrete;

import experimental.patterns.composite.base.BaseComponent;
import experimental.patterns.composite.base.BaseComposite;

/**
 * Used to add multiple nodes together
 * Created by liamdg on 4/08/16.
 */
public class AddComposite extends BaseComposite {

    public AddComposite(final BaseComponent... children) {
        super(children);
    }

    @Override
    public Double evaluateComponent() {
        double value = 0.0;
        for (final BaseComponent component : children) {
            value += component.evaluateComponent();
        }
        return value;
    }
}
