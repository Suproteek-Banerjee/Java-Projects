import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for meal charge
        System.out.print("Enter the charge for the meal: $");
        double mealCharge = scanner.nextDouble();
        
        // Create RestaurantBill object
        RestaurantBill bill = new RestaurantBill(mealCharge);
        
        // Display the bill summary
        bill.displayBillSummary();
        
        // Close scanner
        scanner.close();
    }
}
