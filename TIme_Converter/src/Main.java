/**
 * LAB 01 - CS 201
 * Suproteek Banerjee
 * CWID - A20637525
 * This Project converts total seconds into hours, minutes, and seconds.
 *
 * Inputs:
 *   1. Total seconds
 *
 * Outputs:
 *   Hours, minutes, and seconds in a formatted way
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Startup Banner
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("            WELCOME TO THE TIME CONVERSION PROGRAM            ");
        System.out.println("**************************************************************");
        System.out.println();

        // Input section
        System.out.print("Enter total seconds: ");
        int totalSeconds = in.nextInt();

        // Calculations
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Output section
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Total Seconds: " + totalSeconds);
        System.out.println("Converted Time: " + hours + " hour(s): "
                + minutes + " minute(s): " + seconds + " second(s)");
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("THANK YOU FOR USING THE TIME CONVERSION PROGRAM!");
    }
}
