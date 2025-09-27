import java.util.Scanner;

// Class representing a Sale
class Sale {
    private double purchaseAmount;
    private static final double STATE_TAX_RATE = 0.055; // 5.5%
    private static final double COUNTY_TAX_RATE = 0.02; // 2%

    // Constructor
    public Sale(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    // Getters for taxes
    public double getStateTax() {
        return purchaseAmount * STATE_TAX_RATE;
    }

    public double getCountyTax() {
        return purchaseAmount * COUNTY_TAX_RATE;
    }

    public double getTotalTax() {
        return getStateTax() + getCountyTax();
    }

    public double getTotalSale() {
        return purchaseAmount + getTotalTax();
    }

    // Display method
    public void displaySummary() {
        System.out.println("\n--- Sales Tax Summary ---");
        System.out.printf("Purchase Amount: $%.2f%n", purchaseAmount);
        System.out.printf("State Sales Tax (5.5%%): $%.2f%n", getStateTax());
        System.out.printf("County Sales Tax (2%%): $%.2f%n", getCountyTax());
        System.out.printf("Total Sales Tax: $%.2f%n", getTotalTax());
        System.out.printf("Total Sale: $%.2f%n", getTotalSale());
    }
}

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the amount of the purchase: ");
        double amount = scanner.nextDouble();

        // Create Sale object
        Sale sale = new Sale(amount);

        // Display summary
        sale.displaySummary();

        scanner.close();
    }
}
