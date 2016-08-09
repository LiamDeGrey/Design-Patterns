package experimental.patterns.decorator.pizzas;

import java.util.ArrayList;
import java.util.List;

import experimental.patterns.decorator.Pizza;

/**
 * The base Pizza to be extended by a type of pizza
 * Created by liamdg on 9/08/16.
 */
public abstract class BasePizza implements Pizza {
    protected List<String> ingredients;

    public BasePizza() {
        ingredients = new ArrayList<>();
    }

    @Override
    public void topPizza() {
        addToppings(new ArrayList<>());
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }
}
