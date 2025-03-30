package Session13.bt6;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class Invoice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Product 1", 100));
        products.add(new Product("Product 2", 200));
        products.add(new Product("Product 3", 300));
        products.add(new Product("Product 4", 400));
        products.add(new Product("Product 5", 500));

        displayInvoice(products);
    }

    public static void displayInvoice(List<Product> products) {
        System.out.println("===================================");
        System.out.printf("%-15s | %-10s\n", "Product Name", "Price");
        System.out.println("-----------------------------------");

        double total = calculateTotal(products);
        for (Product p : products) {
            System.out.printf("%-15s | %-10.2f\n", p.getName(), p.getPrice());
        }

        double tax = calculateTax(total);
        double finalAmount = total + tax;

        System.out.println("-----------------------------------");
        System.out.printf("Total:         | %-10.2f\n", total);
        System.out.printf("Tax:     | %-10.2f\n", tax);
        System.out.printf("Final Amount:  | %-10.2f\n", finalAmount);
        System.out.println("-----------------------------------");
    }

    public static double calculateTotal(List<Product> products) {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public static double calculateTax(double total) {
        return total * 0.1;
    }
}
