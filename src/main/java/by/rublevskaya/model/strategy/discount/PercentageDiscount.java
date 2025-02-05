package by.rublevskaya.model.strategy.discount;

import by.rublevskaya.model.strategy.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - percentage / 1000);
    }
}

