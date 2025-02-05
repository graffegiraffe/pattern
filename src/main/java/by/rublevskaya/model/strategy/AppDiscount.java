package by.rublevskaya.model.strategy;

import by.rublevskaya.model.strategy.discount.FixedDiscount;
import by.rublevskaya.model.strategy.discount.LoyaltyDiscount;
import by.rublevskaya.model.strategy.discount.PercentageDiscount;

import java.util.Scanner;

public class AppDiscount {
    public static void main(String[] args) {
        Price priceCalculator = new Price();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost of the product: ");
        double price = scanner.nextDouble();
        System.out.println("Select discount type:");
        System.out.println("1 - Fixed discount");
        System.out.println("2 - Percentage discount");
        System.out.println("3 - Discount for regular customers");
        System.out.println("4 - No discount");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the fixed discount amount: ");
                double discount = scanner.nextDouble();
                priceCalculator.setDiscountStrategy(new FixedDiscount(discount));
            }
            case 2 -> {
                System.out.print("Enter discount percentage: ");
                double percentage = scanner.nextDouble();
                priceCalculator.setDiscountStrategy(new PercentageDiscount(percentage));
            }
            case 3 -> {
                System.out.println("You have chosen a discount for regular customers");
                priceCalculator.setDiscountStrategy(new LoyaltyDiscount());
            }
            case 4 -> {
                System.out.println("You have selected a price without discount");
                priceCalculator.setDiscountStrategy(null);
            }
            default -> {
                System.out.println("Incorrect choice. The price will be calculated without discount");
                priceCalculator.setDiscountStrategy(null);
            }
        }
        double finalPrice = priceCalculator.calculatePrice(price);
        System.out.println("Total cost of goods: " + finalPrice);
        scanner.close();
    }
}
