package experimental.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A buffet that contains numerous meals
 * Created by liamdg on 5/08/16.
 */
public class Buffet implements Iterator<Meal> {
    private List<Meal> meals;
    private int currentMealIndex;

    public Buffet() {
        meals = new ArrayList<>();
        currentMealIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return meals.size() > currentMealIndex;
    }

    @Override
    public Meal next() {
        return meals.get(currentMealIndex++);
    }
}
