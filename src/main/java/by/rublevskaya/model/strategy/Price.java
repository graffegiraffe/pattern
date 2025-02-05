package by.rublevskaya.model.strategy;

public class Price {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculatePrice(double price) {
        if (discountStrategy == null) {
            return price;
        }
        return discountStrategy.applyDiscount(price);
    }
}
