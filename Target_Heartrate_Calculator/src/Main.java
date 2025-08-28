/**
 * LAB 01 - CS 201
 * Suproteek Banerjee
 * CWID - A20637525
 * This Project calculates the individual target heart rate zone (THRZ)
 * for aerobic exercise based on a person's age.
 *
 * Inputs:
 *   1. Age of the person (years)
 *
 * Output:
 *   Target heart rate range in beats per minute (bpm)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Startup Banner
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("         WELCOME TO THE TARGET HEART RATE CALCULATOR         ");
        System.out.println("**************************************************************");
        System.out.println();

        // Input section
        System.out.print("Enter your age (years): ");
        int age = in.nextInt();

        // Constants
        final double LOWER_PERCENT = 0.60; // 60%
        final double UPPER_PERCENT = 0.75; // 75%
        final int MAX_HEART_RATE_BASE = 220;

        // Calculations
        int predictedMaxHR = MAX_HEART_RATE_BASE - age;
        int lowerTHRZ = (int)(predictedMaxHR * LOWER_PERCENT);
        int upperTHRZ = (int)(predictedMaxHR * UPPER_PERCENT);

        // Output section
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Predicted Max Heart Rate: " + predictedMaxHR + " bpm");
        System.out.println("Target Heart Rate Zone:  " + lowerTHRZ + " - " + upperTHRZ + " bpm");
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("THANK YOU FOR USING THE TARGET HEART RATE CALCULATOR!");
    }
}
