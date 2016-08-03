package experimental.patterns.composite.base;

/**
 * Used as a base for composite objects that have multiple children
 * creating a tree-like structure
 * Created by liamdg on 4/08/16.
 */
public abstract class BaseComposite extends BaseComponent {
    protected final BaseComponent[] children;

    public BaseComposite(final BaseComponent... children) {
        this.children = children;
    }
}
