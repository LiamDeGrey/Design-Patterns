package experimental.patterns.decorator.pizzas;

import java.util.List;

/**
 * A cheese based pizza
 * Created by liamdg on 9/08/16.
 */
public class CheesePizza extends BasePizza {

    @Override
    public void addToppings(final List<String> toppings) {
        toppings.add("Cheese");
        ingredients.addAll(toppings);
    }
}
