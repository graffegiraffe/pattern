package by.rublevskaya.model.strategy.discount;

import by.rublevskaya.model.strategy.DiscountStrategy;

public class FixedDiscount implements DiscountStrategy {
    private final double discount;

    public FixedDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - discount;
    }
}

