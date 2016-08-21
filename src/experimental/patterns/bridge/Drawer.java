package experimental.patterns.bridge;

/**
 * The drawer interface to be implemented by concrete drawers
 * that intend to use the draw function in a certain way
 * Created by liamdg on 21/08/16.
 */
public interface Drawer {

    void draw(final int x, final int y, final int width, final int height);
}
