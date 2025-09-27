import java.util.Scanner;
import java.text.DecimalFormat;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of days
        System.out.print("Enter the number of days worked: ");
        int days = sc.nextInt();

        // Validate input (must be at least 1 day)
        while (days < 1) {
            System.out.print("Invalid input. Number of days must be at least 1. Enter again: ");
            days = sc.nextInt();
        }

        // Decimal format with comma separator
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        double dailyPay = 0.01; // first day = 1 penny
        double totalPay = 0.0;  // accumulate total

        // Print table header
        System.out.println("\nDay\tDaily Pay");
        System.out.println("-------------------");

        // Loop for each day
        for (int day = 1; day <= days; day++) {
            System.out.println(day + "\t" + df.format(dailyPay));
            totalPay += dailyPay;    // add today’s pay to total
            dailyPay *= 2;           // double pay for next day
        }

        // Print total earnings
        System.out.println("\nTotal pay after " + days + " days: " + df.format(totalPay));
    }
}