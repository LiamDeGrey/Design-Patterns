package experimental.patterns.decorator.pizzas;

import java.util.List;

/**
 * A tomato based pizza
 * Created by liamdg on 9/08/16.
 */
public class TomatoPizza extends BasePizza {

    @Override
    public void addToppings(final List<String> toppings) {
        toppings.add("Tomato");
        ingredients.addAll(toppings);
    }
}
