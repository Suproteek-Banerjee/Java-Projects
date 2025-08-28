/**
 * This Project is a Calorie Calculator to Calculate
 * The Calories a person needs to eat for losing weight.
 * goal: Practice inputs and if-else statements
 * */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Putting some space between the console data and the project.

        System.out.println(" ");
        System.out.println(" ");

        //Startup

        System.out.println("******************************");
        System.out.println("Welcome to the Calorie Calculator");
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

        // Getting the User's Activity Level
        System.out.println(" ");
        System.out.println("------------------------------");
        System.out.println("Tell us about your activity level -");
        System.out.println("------------------------------");
        System.out.println("ENTER 1 FOR Sedentary (little/no exercise)");
        System.out.println("ENTER 2 FOR Lightly active (1-3 days/week)");
        System.out.println("ENTER 3 FOR Moderately active (3-5 days/week)");
        System.out.println("ENTER 4 FOR Very active (6-7 days/week)");
        System.out.println("ENTER 5 FOR Extra active (hard exercise + job)");
        System.out.println("------------------------------");

        int activity;
        input.nextLine();
        System.out.print("Please enter your weekly activity: ");
        activity = input.nextInt();

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

        //Calculating TDEE

        double tdee = 0;
        if (activity == 1) {
            tdee = bmr * 1.2;
        }
        else if (activity == 2) {
            tdee = bmr * 1.375;
        }
        else if (activity == 3) {
            tdee = bmr * 1.55;
        }
        else if (activity == 4) {
            tdee = bmr * 1.725;
        }
        else if (activity == 5) {
            tdee = bmr * 1.9;
        }

        // Calculating Calorie Deficit
        System.out.println("------------------------------");
        double calorie_deficit;
        System.out.println("Please enter the calories you want to deficit");
        System.out.println("Enter 0 to maintain weight upto 1000 to lose weight upto ~1kg a week");
        System.out.println("Enter Deficit Value: ");
        calorie_deficit = input.nextDouble();
        System.out.println("------------------------------");

        double calories;

        if (calorie_deficit >= 0 && calorie_deficit <= 1000 ) {
            calories = tdee - calorie_deficit;
            System.out.println("Your Need to eat " + calories + " calories per day.");
        }
        else if (calorie_deficit > 1000) {
            System.out.println("It is not healthy to be on a deficit of more than a 1000 calories a day.");
        }
        System.out.println("------------------------------");
        System.out.println(" ");
        System.out.println("******************************");
        System.out.println("THANK YOU FOR USING THE CALORIE CALCULATOR");
        System.out.println("HAPPY WEIGHT LOSS");
        System.out.println("******************************");
    }
}
