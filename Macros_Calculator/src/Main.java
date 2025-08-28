import java.util.Scanner;

/**
 * This is a Calculator for all the macronutrients required for the human body to stay healthy.
 * It calculates total consumable amount of protein, fats and carbs in grams based on user's body weight
 **/
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Putting some space between the console data and the project.

        System.out.println(" ");
        System.out.println(" ");

        //Startup

        System.out.println("******************************");
        System.out.println("Welcome to the Macros Calculator");
        System.out.println("******************************");
        System.out.println("------------------------------");

        // Getting User's Name

        String username;
        System.out.print("Please enter your name: ");
        username = input.nextLine();

        //Getting User's Age

        double age;
        System.out.print("Please enter your age: ");
        age = input.nextDouble();

        double weight;
        System.out.print("Please enter your weight (in kg): ");
        weight = input.nextDouble();

        //Calculation

        double protein;
        protein = weight * 1.6;

        double carbs;
        carbs = weight * 0.9;

        double fats;
        fats = weight * 0.45;

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println(" ");

        System.out.println("Hello, " + username + " your daily intake macros are listed below: ");
        System.out.println(" ");
        System.out.println("Protein: " + protein + "g");
        System.out.println("Carbs: " + carbs + "g");
        System.out.println("Fats: " + fats + "g");

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println("HAVE FUN TRACKING YOUR MACROS");
        System.out.println("------------------------------");
    }
}