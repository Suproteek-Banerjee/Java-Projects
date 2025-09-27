import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of years
        System.out.print("Enter the number of years (>=1): ");
        int years = sc.nextInt();
        while (years < 1) {
            System.out.print("Invalid input! Number of years must be >= 1: ");
            years = sc.nextInt();
        }

        double totalRainfall = 0;
        int totalMonths = years * 12;

        // Outer loop for each year
        for (int y = 1; y <= years; y++) {
            System.out.println("Year " + y + ":");

            // Inner loop for each month
            for (int m = 1; m <= 12; m++) {
                System.out.print("  Enter rainfall for month " + m + " (in inches): ");
                double rainfall = sc.nextDouble();

                while (rainfall < 0) {
                    System.out.print("    Invalid input! Rainfall cannot be negative: ");
                    rainfall = sc.nextDouble();
                }

                totalRainfall += rainfall;
            }
        }

        // Calculate average
        double averageRainfall = totalRainfall / totalMonths;

        // Display results
        System.out.println("\nTotal months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.printf("Average rainfall per month: %.2f inches%n", averageRainfall);

        sc.close();
    }
}