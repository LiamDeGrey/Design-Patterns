package experimental.patterns.decorator.toppers;

import java.util.ArrayList;
import java.util.List;

import experimental.patterns.decorator.Pizza;

/**
 * The base pizza topper to be extended by other toppers
 * ensuring the correct structure is used
 * Created by liamdg on 9/08/16.
 */
public abstract class BasePizzaTopper implements Pizza {
    protected Pizza pizza;

    public BasePizzaTopper(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void addToppings(final List<String> toppings) {
        pizza.addToppings(toppings);
    }

    @Override
    public void topPizza() {
        addToppings(new ArrayList<>());
    }

    @Override
    public List<String> getIngredients() {
        return pizza.getIngredients();
    }
}
