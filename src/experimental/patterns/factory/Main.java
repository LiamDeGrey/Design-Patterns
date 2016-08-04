package experimental.patterns.factory;

import java.util.Locale;

import experimental.patterns.factory.cars.CommuterCar;
import experimental.patterns.factory.cars.LuxuryCar;
import experimental.patterns.factory.cars.SportsCar;
import experimental.patterns.factory.creator.Car;
import experimental.patterns.factory.creator.CarFactory;
import experimental.utils.Constants;

/**
 * Used to initiate the corresponding pattern program
 * Created by liamdg on 4/08/16.
 */
public class Main {
    private static final String PATTERN_NAME = "Factory";

    public static void main(final String[] args) {
        System.out.printf(Locale.getDefault(), Constants.STARTUP_MSG, PATTERN_NAME);

        final double commuterCarMoney = Math.random() * CarPrices.COMMUTER_CAR_MAX + CarPrices.COMMUTER_CAR_MIN;
        final double sportsCarMoney = Math.random() * CarPrices.SPORTS_CAR_MAX + CarPrices.SPORTS_CAR_MIN;
        final double luxuryCarMoney = Math.random() * CarPrices.LUXURY_CAR_MAX + CarPrices.LUXURY_CAR_MIN;

        final Car commuterCar = CarFactory.buyCar(commuterCarMoney);
        final Car sportsCar = CarFactory.buyCar(sportsCarMoney);
        final Car luxuryCar = CarFactory.buyCar(luxuryCarMoney);

        System.out.printf(Locale.getDefault(), "Purchased commuter car correctly? %b\n", commuterCar instanceof CommuterCar);
        System.out.printf(Locale.getDefault(), "Purchased sports car correctly? %b\n", sportsCar instanceof SportsCar);
        System.out.printf(Locale.getDefault(), "Purchased luxury car correctly? %b\n", luxuryCar instanceof LuxuryCar);
    }
}
