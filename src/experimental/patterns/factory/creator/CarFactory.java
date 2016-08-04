package experimental.patterns.factory.creator;

import experimental.patterns.factory.CarPrices;
import experimental.patterns.factory.cars.CommuterCar;
import experimental.patterns.factory.cars.LuxuryCar;
import experimental.patterns.factory.cars.SportsCar;

/**
 * The factory to create cars given an input
 * Created by liamdg on 5/08/16.
 */
public class CarFactory {

    public static Car buyCar(final double money) {
        if (money > 0.0) {
            if (money <= CarPrices.COMMUTER_CAR_MAX) {
                return new CommuterCar();
            }
            else if (money <= CarPrices.SPORTS_CAR_MAX) {
                return new SportsCar();
            }
            else if (money <= CarPrices.LUXURY_CAR_MAX) {
                return new LuxuryCar();
            }
        }

        return null;
    }
}
