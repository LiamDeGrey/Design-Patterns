package experimental.patterns.decorator;

import java.util.List;

/**
 * An interface to be implemented by actual pizzas
 * and also pizza toppers
 * Created by liamdg on 9/08/16.
 */
public interface Pizza {

    void addToppings(final List<String> toppings);

    void topPizza();

    List<String> getIngredients();
}
