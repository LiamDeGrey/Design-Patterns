package experimental.patterns.bridge;

/**
 * Created by liamdg on 21/08/16.
 */
public abstract class Shape {
    protected final Drawer drawer;

    public Shape(final Drawer drawer) {
        this.drawer = drawer;
    }

    public abstract void draw();
}
