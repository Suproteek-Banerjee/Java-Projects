/**
 * This Project is a BMR Calculator to Calculate
 * The number of calories your body needs to perform its most basic functions while at complete rest.
 * goal: Practice inputs and if-else statements
 * */

import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Putting some space between the console data and the project.

        System.out.println(" ");
        System.out.println(" ");

        //Startup

        System.out.println("******************************");
        System.out.println("Welcome to the BMR Calculator");
        System.out.println("******************************");
        System.out.println(" ");
        System.out.println("BMR is the number of calories your body needs to perform " +
                "its most basic functions while at complete rest.");
        System.out.println("------------------------------");

        // Getting User's Name

        String username;
        System.out.print("Please enter your name: ");
        username = input.nextLine();

        //Getting User's Age

        double age;
        System.out.print("Please enter your age: ");
        age = input.nextDouble();

        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println("Specify Your gender: Enter 'M' for Male and 'F for Female.");
        System.out.println("------------------------------");


        // Getting User's Gender

        String gender;
        input.nextLine();
        System.out.print("Please enter your gender: ");
        gender = input.nextLine();

        // Getting User's Height in cm

        double height;
        System.out.print("Enter your height in Centimeters (cm): ");
        height = input.nextDouble();

        // Getting User's Weight in kg

        double weight;
        System.out.print("Enter your weight in Kilograms (kg): ");
        weight = input.nextDouble();

        //BMR Declaration

        double bmr = 0; // declaring and initializing BMR variable

        //if-else

        if (gender.equals("M")) {
            bmr = 10 * weight + 6.25 * height - 5 * age + 5;
            System.out.println("------------------------------");
            System.out.println("Your BMR is " + bmr);
        }

        if (gender.equals("F")) {
            bmr = 10 * weight + 6.25 * height - 5 * age -161;
            System.out.println("------------------------------");
            System.out.println("Your BMR is " + bmr);
        }

        System.out.println("------------------------------");
        System.out.println("THANK YOU FOR USING THE BMR CALCULATOR");
    }
}
