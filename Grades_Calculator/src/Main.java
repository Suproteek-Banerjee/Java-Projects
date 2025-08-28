/**
 * LAB 01 - CS 201
 * Suproteek Banerjee
 * CWID - A20637525
 * This Project calculates a student's weighted average for CS 201
 * Goal: Practice user input, arithmetic operations, and weighted average calculation
 * Weighting:
 *  Quiz #1      - 10%
 *  Quiz #2      - 15%
 *  Midterm Exam - 25%
 *  Final Exam   - 30%
 *  Labs (4 labs)- 20%
 * Total = 100%
 * Bonus: Trying to incorporate a grades feature to output the final grade.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Startup
        System.out.println();
        System.out.println("**************************************************************");
        System.out.println("Hello Professor Welcome to CS 201 Weighted Average Calculator");
        System.out.println("**************************************************************");
        System.out.println();

        // Inputs
        System.out.print("Enter Quiz #1 score (out of 100): ");
        int quiz1 = input.nextInt();

        System.out.print("Enter Quiz #2 score (out of 100): ");
        int quiz2 = input.nextInt();

        System.out.print("Enter Midterm Exam score (out of 100): ");
        int midterm = input.nextInt();

        System.out.print("Enter Final Exam score (out of 100): ");
        int finalExam = input.nextInt();

        // Labs: 4 labs, each out of 100
        int totalLabScore = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Lab #" + i + " score (out of 100): ");
            totalLabScore += input.nextInt();
        }

        // Average lab score (since 4 labs together count for 20%)
        double averageLabScore = totalLabScore / 4.0;

        // Weighted Average Calculation
        double weightedAverage = (quiz1 * 0.10) +
                (quiz2 * 0.15) +
                (midterm * 0.25) +
                (finalExam * 0.30) +
                (averageLabScore * 0.20);

        String grades = "";
        if (weightedAverage >= 90){
            grades = "A";
        }
        if (weightedAverage >= 80 && weightedAverage < 90){
            grades = "B";
        }
        if (weightedAverage >= 70 && weightedAverage < 80){
            grades = "C";
        }
        if (weightedAverage >= 60 && weightedAverage < 70){
            grades = "D";
        }
        if (weightedAverage < 60){
            grades = "F";
        }

        // Output
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Student's Weighted Average: " + weightedAverage);
        System.out.println("Student's Final Grade: " + grades);
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("THANK YOU FOR USING THE CS 201 Weighted Average CALCULATOR!");
    }
}