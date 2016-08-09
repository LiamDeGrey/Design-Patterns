package experimental.patterns.decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import experimental.patterns.decorator.pizzas.CheesePizza;
import experimental.patterns.decorator.pizzas.TomatoPizza;
import experimental.patterns.decorator.toppers.BaconPizzaTopper;
import experimental.patterns.decorator.toppers.PepperPizzaTopper;
import experimental.patterns.decorator.toppers.PineapplePizzaTopper;
import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Decorator";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final Pizza baconPepperCheesePizza = new BaconPizzaTopper(new PepperPizzaTopper(new CheesePizza()));
        final Pizza pineapplePepperTomatoPizza = new PineapplePizzaTopper(new PepperPizzaTopper(new TomatoPizza()));

        baconPepperCheesePizza.topPizza();
        pineapplePepperTomatoPizza.topPizza();

        final List<String> expectedIngredientsBaconPepperCheesePizza = new ArrayList<>();
        final List<String> expectedIngredientsPineapplePepperTomatoPizza = new ArrayList<>();

        expectedIngredientsBaconPepperCheesePizza.addAll(Arrays.asList("Bacon", "Pepper", "Cheese"));
        expectedIngredientsPineapplePepperTomatoPizza.addAll(Arrays.asList("Pineapple", "Pepper", "Tomato"));

        final boolean correct =
                baconPepperCheesePizza.getIngredients().equals(expectedIngredientsBaconPepperCheesePizza) &&
                        pineapplePepperTomatoPizza.getIngredients().equals(expectedIngredientsPineapplePepperTomatoPizza);

        System.out.println("Decorator works correctly? " + correct);
    }
}
