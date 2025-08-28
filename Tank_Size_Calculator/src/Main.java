/**
 * LAB 01 - CS 201
 * Suproteek Banerjee
 * CWID - A20637525
 * This Project calculates the minimum above-ground holding tank size
 * needed to meet one day's water demand for a family using a low-yield well.
 *
 * Inputs:
 *   1. Radius of the well casing (inches)
 *   2. Total depth of the well (feet)
 *   3. Number of family members
 *
 * Output:
 *   Minimum above-ground tank size in gallons (0 if well storage is sufficient)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Startup Banner
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("       WELCOME TO THE WELL WATER HOLDING TANK CALCULATOR       ");
        System.out.println("**************************************************************");
        System.out.println();

        // Input section
        System.out.print("Enter radius of the well casing (inches): ");
        double radius = in.nextDouble();

        System.out.print("Enter total depth of the well (feet): ");
        double depth = in.nextDouble();

        System.out.print("Enter number of family members: ");
        int familySize = in.nextInt();

        // Constants
        final double MY_PI = 3.14159;
        final double GAL_PER_CUBIC_FOOT = 7.48;
        final int GAL_PER_PERSON = 60;
        final int INCHES_PER_FOOT = 12;
        final int WATER_LEVEL = 50; // Static water level below ground

        // Calculations
        double radiusFeet = radius / INCHES_PER_FOOT;
        double waterDepth = depth - WATER_LEVEL;
        double volumeWell = MY_PI * radiusFeet * radiusFeet * waterDepth;
        double gallonsWell = volumeWell * GAL_PER_CUBIC_FOOT;
        int gallonsFamily = GAL_PER_PERSON * familySize;

        double gallonsNeeded = gallonsFamily - gallonsWell;
        gallonsNeeded = Math.max(0, gallonsNeeded); // No negative tank sizes

        // Output section
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Water Demand for Family: " + gallonsFamily + " gallons");
        System.out.println("Water Storage in Well:   " + gallonsWell + " gallons");
        System.out.println("Additional Tank Needed:  " + gallonsNeeded + " gallons");
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("THANK YOU FOR USING THE WELL WATER HOLDING TANK CALCULATOR!");
    }
}
