package experimental.patterns.decorator.toppers;

import java.util.List;

import experimental.patterns.decorator.Pizza;

/**
 * A topper (decorator) that adds bacon to a pizza
 * Created by liamdg on 9/08/16.
 */
public class PepperPizzaTopper extends BasePizzaTopper {

    public PepperPizzaTopper(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings(final List<String> toppings) {
        toppings.add("Pepper");
        super.addToppings(toppings);
    }
}
