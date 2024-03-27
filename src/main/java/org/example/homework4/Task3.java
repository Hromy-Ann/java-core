package org.example.homework4;

public class Task3 {
    public static void main(String[] args) {
        // price of the product
        double unitPrice = 10.0;
        // Quantity
        int quantity = 8;
        double totalCost = calculateTotalCost(unitPrice, quantity);
        System.out.println("Total cost of the product: " + totalCost);
    }

    private static double calculateTotalCost(double price, int quantity) {
        double discount = 0.0;
        if (quantity > 10 && quantity <= 20) {
            discount = 0.05;
        }
        if (quantity > 20 && quantity <= 30) {
            discount = 0.1;
        }
        if (quantity > 30 && quantity <= 80) {
            discount = 0.12 + 0.004 * ((quantity - 30) / 10);
        }
        if (quantity > 80) {
            discount = 0.13;
        }
        return price * quantity * (1 - discount);
    }
}
