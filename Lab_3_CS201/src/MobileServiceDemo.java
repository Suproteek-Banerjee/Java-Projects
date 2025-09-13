/*---------------------------------------------------------
   Program: MobileServiceDemo.java
   Purpose: Calculate monthly bill based on selected package
---------------------------------------------------------*/

import java.util.Scanner;

/*---------------------------------------------------------
   Class: MobileServiceProvider
   Stores package type and minutes used, and calculates bill
---------------------------------------------------------*/
class MobileServiceProvider {
    private char packageType;
    private int minutesUsed;

    // Constructor
    public MobileServiceProvider(char packageType, int minutesUsed) {
        this.packageType = Character.toUpperCase(packageType);
        this.minutesUsed = minutesUsed;
    }

    // Method: calculateBill
    public double calculateBill() {
        switch (packageType) {
            case 'A':
                double baseA = 39.99;
                int freeA = 450;
                double rateA = 0.45;
                return (minutesUsed > freeA)
                        ? baseA + (minutesUsed - freeA) * rateA
                        : baseA;

            case 'B':
                double baseB = 59.99;
                int freeB = 900;
                double rateB = 0.40;
                return (minutesUsed > freeB)
                        ? baseB + (minutesUsed - freeB) * rateB
                        : baseB;

            case 'C':
                return 69.99;

            default:
                System.out.println("Error: Invalid package type.");
                return 0.0;
        }
    }
}

/*---------------------------------------------------------
   Class: MobileServiceDemo
   Main method for user input and displaying results
---------------------------------------------------------*/
public class MobileServiceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display header
        System.out.println("==========================================");
        System.out.println("       Mobile Service Billing System       ");
        System.out.println("==========================================");

        // User input
        System.out.print("Enter your package (A, B, or C): ");
        char pkg = sc.next().charAt(0);

        System.out.print("Enter total minutes used: ");
        int minutes = sc.nextInt();

        // Create service object
        MobileServiceProvider service = new MobileServiceProvider(pkg, minutes);

        // Calculate bill
        double total = service.calculateBill();

        // Display result
        System.out.println("------------------------------------------");
        System.out.println("Package Selected: " + Character.toUpperCase(pkg));
        System.out.println("Minutes Used    : " + minutes);
        System.out.printf("Total Charges   : $%.2f\n", total);
        System.out.println("==========================================");

        sc.close();
    }
}
