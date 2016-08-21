package experimental.patterns.bridge;

/**
 * Created by liamdg on 21/08/16.
 */
public class Circle extends Shape {
    private final int x, y, radius;


    public Circle(final int x, final int y, final int radius, final Drawer drawer) {
        super(drawer);

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawer.draw(x, y, radius * 2, radius * 2);
    }
}
