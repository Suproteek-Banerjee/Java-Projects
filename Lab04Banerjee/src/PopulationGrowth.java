
import java.util.Scanner;

class Population {
    private int startingSize;
    private double dailyIncrease; // percentage
    private int days;

    // Constructor
    public Population(int startingSize, double dailyIncrease, int days) {
        this.startingSize = startingSize;
        this.dailyIncrease = dailyIncrease;
        this.days = days;
    }

    // Method to display population growth each day
    public void displayPopulation() {
        double population = startingSize;
        System.out.println("\nDay\tPopulation");

        for (int day = 1; day <= days; day++) {
            System.out.printf("%d\t%.2f%n", day, population);
            // Increase by percentage
            population += population * (dailyIncrease / 100.0);
        }
    }
}

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Starting size
        System.out.print("Enter the starting size of the population (>= 2): ");
        int start = sc.nextInt();
        while (start < 2) {
            System.out.print("Invalid input! Starting size must be at least 2: ");
            start = sc.nextInt();
        }

        // Input: Daily increase (percentage)
        System.out.print("Enter the average daily population increase (as %): ");
        double increase = sc.nextDouble();
        while (increase < 0) {
            System.out.print("Invalid input! Increase cannot be negative: ");
            increase = sc.nextDouble();
        }

        // Input: Number of days
        System.out.print("Enter the number of days the population will multiply (>= 1): ");
        int days = sc.nextInt();
        while (days < 1) {
            System.out.print("Invalid input! Days must be at least 1: ");
            days = sc.nextInt();
        }

        // Create object and display growth
        Population pop = new Population(start, increase, days);
        pop.displayPopulation();

        sc.close();
    }
}
