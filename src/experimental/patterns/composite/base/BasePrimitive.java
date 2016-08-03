package experimental.patterns.composite.base;

/**
 * Used as a base for a primitive object that has a single value
 * and no children
 * Created by liamdg on 4/08/16.
 */
public abstract class BasePrimitive extends BaseComponent {
    protected final double value;

    public BasePrimitive(final double value) {
        this.value = value;
    }
}
