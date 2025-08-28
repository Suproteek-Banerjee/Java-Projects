/**
 * This is a program to calculate the sales tax and tip percentage and also an exact amount to split between the payees.
 * */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Putting some space between the console data and the project.

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("----------------------------");

        // Getting number of users
        double users;
        System.out.println("Enter the number of payees: ");
        users = input.nextDouble();

        // Getting the total amount

        double amount;
        System.out.println("Enter the total amount before taxes: ");
        amount = input.nextDouble();

        // calculating the sales tax
        double tax;
        double tax_percentage;
        System.out.println("Enter the percentage of sales tax: ");
        tax_percentage = input.nextDouble();

        tax = (tax_percentage / 100) * amount;

        // calculating the tip

        double tip;
        double tip_percentage;
        System.out.println("Enter the percentage of tip: ");
        tip_percentage = input.nextDouble();

        tip = (tip_percentage / 100) * amount;

        System.out.println(" ");
        System.out.println("----------------------------");

        // grand total

        double grand_total;
        double grand_total_split;
        grand_total = amount + tax + tip;
        grand_total_split = grand_total / users;

        // cost breakdown
        System.out.println("YOUR TOTAL COST BREAKDOWN");
        System.out.println("----------------------------");
        System.out.println(" ");
        System.out.println("Total Amount: $" + amount);
        System.out.println("Tax: $" + tax);
        System.out.println("Tip: $" + tip);
        System.out.println(" ");
        System.out.println("----------------------------");
        System.out.println(" ");
        System.out.println("GRAND TOTAL: $" + grand_total);
        System.out.println(" ");
        System.out.println("Each PAYEE OWES: $" + grand_total_split);
        System.out.println(" ");
        System.out.println("----------------------------");
    }
}