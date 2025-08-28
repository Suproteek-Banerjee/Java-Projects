import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        double principal;
        System.out.print("Enter the amount you plan to invest: $");
        principal = input.nextDouble();

        double interest;
        System.out.print("Enter the annual interest rate: ");
        interest = input.nextDouble();

        double years;
        System.out.print("How many years do you want to invest for: ");
        years = input.nextDouble();

        double futureValue;
        futureValue = principal * (Math.pow((1 + (interest / 100)), years));

        System.out.println(" ");
        System.out.println("-------------------------------------------");
        System.out.printf("The future investment return will be $%.2f%n", futureValue);

        System.out.println("-------------------------------------------");
    }
}