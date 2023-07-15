package OOP.Inheritance.Exercise.Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

    private final double COFFEE_MILLILITERS = 50;
    private final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    private double caffeine;

    public Coffee(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    public double getCaffeine() {
        return caffeine;
    }
}
