import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // getting user's datas
        System.out.println(" ");
        System.out.println("******************************");
        System.out.println("INCOME AND SAVINGS CALCULATOR");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println("-------------------------------");
        double income;
        System.out.println("Enter your income:");
        income = input.nextDouble();

        double income_tax_percentage;
        System.out.println("Enter your income tax percentage: ");
        income_tax_percentage = input.nextDouble();

        double income_tax;
        income_tax = (income_tax_percentage / 100) * income;

        double in_hand_salary;
        in_hand_salary = income - income_tax;

        double debt;
        System.out.println("Enter your debt amount: ");
        debt = input.nextDouble();

        double rent;
        System.out.println("Enter your rent: ");
        rent = input.nextDouble();

        double electricity;
        System.out.println("Enter your electricity bill: ");
        electricity = input.nextDouble();

        double wifi;
        System.out.println("Enter your wifi bill: ");
        wifi = input.nextDouble();

        double subscriptions;
        System.out.println("Enter your subscriptions bill: ");
        subscriptions = input.nextDouble();

        double money_remaining;
        money_remaining = in_hand_salary - debt - rent - electricity - wifi - subscriptions;

        // calculating the savings using 50-30-20 rule

        double savings;
        savings = 0.5 * money_remaining;

        double needs;
        needs = 0.3 * money_remaining;

        double leisure;
        leisure = 0.2 * money_remaining;

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Your In Hand Salary After Tax Deduction is: $" + in_hand_salary);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Your In Hand Salary Remaining after " +
                "debt, rent, utilities is: $" + money_remaining);
        System.out.println(" ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("THE MONEY YOU NEED TOWARDS SAVINGS, NEEDS and LEISURE USING 50-20-30 RULE");
        System.out.println(" ");
        System.out.println("EXPECTED SAVINGS: $" + savings);
        System.out.println("EXPECTED NEEDS: $" + needs);
        System.out.println("EXPECTED LEISURE: $" + leisure);
        System.out.println(" ");
        System.out.println("-------------------------------");


    }
}