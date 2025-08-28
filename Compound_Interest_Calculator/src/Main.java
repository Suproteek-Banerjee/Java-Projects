/**
 * This Project is a Compound Interest Calculator
 * Goal: Practice user input, formulas, and output formatting
 * Formula: A = P * (1 + r/n)^(n*t)
 * Compound Interest = A - P
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Adding space before starting
        System.out.println(" ");
        System.out.println(" ");

        // Startup
        System.out.println("************************************");
        System.out.println(" Welcome to the Compound Interest Calculator ");
        System.out.println("************************************");
        System.out.println(" ");
        System.out.println("This calculator helps you find the final amount and compound interest.");
        System.out.println("------------------------------------");

        // Getting User's Name
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        // Borrowed or Invested
        System.out.print("Please enter, if the money is BORROWED or INVESTED: ");
        String moneyState = input.nextLine();

        // Principal Amount
        System.out.print("Please enter your principal amount ($): ");
        double principle = input.nextDouble();

        // Annual Interest Rate
        System.out.print("Please enter your annual rate of interest (%): ");
        double interest = input.nextDouble() / 100;  // Convert to decimal

        // Time in Years
        System.out.print("Please enter the number of years the money is " + moneyState + " for: ");
        double time = input.nextDouble();

        // Compounding frequency
        System.out.print("Enter the number of times that interest is compounded per year: ");
        double n = input.nextDouble();

        System.out.println("------------------------------------");

        // Calculations
        double amount = principle * Math.pow(1 + (interest / n), n * time);
        double compoundInterest = amount - principle;

        // Determine action based on moneyState
        String returns;
        if (moneyState.equalsIgnoreCase("BORROWED")) {
            returns = "OWE";
        } else if (moneyState.equalsIgnoreCase("INVESTED")) {
            returns = "GET";
        } else {
            returns = "HAVE"; // Default fallback if user enters something else
        }

        // Output Results
        System.out.println("Principal Amount: $" + principle);
        System.out.println("Annual Interest Rate: " + (interest * 100) + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Compounded: " + n + " times per year");
        System.out.println("------------------------------------");
        System.out.println("At the end of " + time + " years you will " + returns + " $" + amount);
        System.out.println("------------------------------------");
        System.out.println("COMPOUND INTEREST: $" + compoundInterest);
        System.out.println("------------------------------------");
        System.out.println("THANK YOU FOR USING THE COMPOUND INTEREST CALCULATOR!");
    }
}
