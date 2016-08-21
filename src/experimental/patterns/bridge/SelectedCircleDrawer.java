package experimental.patterns.bridge;

/**
 * Used to draw a circle that has been selected
 * Created by liamdg on 21/08/16.
 */
public class SelectedCircleDrawer implements Drawer {

    @Override
    public void draw(final int x, final int y, final int width, final int height) {
        System.out.println("This circle has been drawn as a selected circle");
    }
}
