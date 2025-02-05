package by.rublevskaya.model.strategy.discount;

import by.rublevskaya.model.strategy.DiscountStrategy;

public class LoyaltyDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8;
    }
}

