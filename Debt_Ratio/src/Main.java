/**
 * LAB 01 - CS 201
 * Suproteek Banerjee
 * CWID - A20637525
 * This Project calculates whether a person can afford to repay a mortgage
 * based on their income, current debt, and other debts.
 *
 * Inputs:
 *   1. Name of the person
 *   2. Income
 *   3. Debt amount
 *   4. Other/previous debts
 *
 * Outputs:
 *   - Lower and Upper Limits for mortgage affordability
 *   - Decision on whether the person can afford the mortgage
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Startup Banner
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("        MORTGAGE AFFORDABILITY CALCULATOR - CS 201 LAB         ");
        System.out.println("**************************************************************");
        System.out.println();

        // Inputs
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("Please enter your monthly income: ");
        double income = input.nextDouble();

        System.out.print("Please enter the new debt amount (mortgage): ");
        double debt = input.nextDouble();

        System.out.print("Please enter other/previous debt amount: ");
        double other_debt = input.nextDouble();

        // Constants for affordability range
        final double LOWER_PERCENT = 0.36;
        final double UPPER_PERCENT = 0.42;

        // Calculations
        double lower_limit = (LOWER_PERCENT * income) - other_debt;
        double upper_limit = (UPPER_PERCENT * income) - other_debt;

        // Output Results
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.printf("Lower Limit (36%%): %.2f%n", lower_limit);
        System.out.printf("Upper Limit (42%%): %.2f%n", upper_limit);
        System.out.println("--------------------------------------------");

        // Decision
        if (debt >= lower_limit && debt <= upper_limit) {
            System.out.println(name + ", you CAN afford to repay the mortgage.");
        } else {
            System.out.println(name + ", you CANNOT afford to repay the mortgage.");
        }

        System.out.println("--------------------------------------------");
        System.out.println("Thank you for using the Mortgage Calculator!");
        System.out.println();
    }
}
