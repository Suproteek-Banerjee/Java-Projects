import java.text.DecimalFormat;

public class RestaurantBill {
    // Instance variables
    private double mealCharge;
    private double taxRate;
    private double tipRate;
    private DecimalFormat currencyFormat;
    
    // Constructor
    public RestaurantBill(double mealCharge) {
        this.mealCharge = mealCharge;
        this.taxRate = 0.075; // 7.5%
        this.tipRate = 0.18;  // 18%
        this.currencyFormat = new DecimalFormat("$0.00");
    }
    
    // Method to calculate tax amount
    public double calculateTax() {
        return mealCharge * taxRate;
    }
    
    // Method to calculate tip amount (18% of meal charge before tax)
    public double calculateTip() {
        return mealCharge * tipRate;
    }
    
    // Method to calculate total bill
    public double calculateTotal() {
        return mealCharge + calculateTax() + calculateTip();
    }
    
    // Getter methods
    public double getMealCharge() {
        return mealCharge;
    }
    
    public double getTaxRate() {
        return taxRate;
    }
    
    public double getTipRate() {
        return tipRate;
    }
    
    // Method to format currency
    public String formatCurrency(double amount) {
        return currencyFormat.format(amount);
    }
    
    // Method to display bill summary
    public void displayBillSummary() {
        System.out.println("\n--- Restaurant Bill Summary ---");
        System.out.println("Meal charge: " + formatCurrency(getMealCharge()));
        System.out.println("Tax amount (7.5%): " + formatCurrency(calculateTax()));
        System.out.println("Tip amount (18%): " + formatCurrency(calculateTip()));
        System.out.println("Total bill: " + formatCurrency(calculateTotal()));
    }
}
