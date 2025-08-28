import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("********************************");
        System.out.println("BODY FAT PERCENTAGE CALCULATOR");
        System.out.println("*********************************");
        System.out.println(" ");

        String name;
        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("ENTER YOUR GENDER MALE OF FEMALE");
        System.out.println(" ");
        System.out.println("ENTER 1 FOR MALE");
        System.out.println("ENTER 2 FOR FEMALE");
        System.out.println(" ");
        System.out.println("--------------------------------");

        int gender;
        System.out.print("Please enter your gender: ");
        gender = input.nextInt();

        double neck;
        System.out.print("Please enter your neck (cm): ");
        neck = input.nextDouble();

        double waist;
        System.out.print("Please enter your waist (cm): ");
        waist = input.nextDouble();

        if (waist <= neck) {
            System.out.println("Error: Waist must be greater than neck.");
            return; // stop the program
        }

        double height;
        System.out.print("Please enter your height (cm): ");
        height = input.nextDouble();

        double bfp;

        if (gender == 1) {
            bfp = 495 / (1.0324 - 0.19077 * Math.log10(waist - neck) + 0.15456 * Math.log10(height)) - 450;
            System.out.println("Hello " + name + " your body fat percentage is " + bfp +"%");
        }
        else if (gender == 2) {
            double hip;
            System.out.print("Please enter your hip (cm): ");
            hip = input.nextDouble();

            bfp = 495 / (1.29579 - 0.35004 * Math.log10(waist + hip - neck) + 0.22100 * Math.log10(height)) - 450;
            System.out.println("Hello " + name + " your body fat percentage is " + bfp +"%");
        }
    }
}