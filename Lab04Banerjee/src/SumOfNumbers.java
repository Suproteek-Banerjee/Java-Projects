import java.util.Scanner;

// Class that performs the summation of numbers
class NumberSummer {
    private int number;  // Variable to store the user input

    // Constructor that takes the number as input
    public NumberSummer(int number) {
        // Check that the number is valid (positive and nonzero)
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive and nonzero.");
        }
        this.number = number;
    }

    // Method to calculate the sum of numbers from 1 to 'number'
    public int calculateSum() {
        int sum = 0;  // Variable to hold the running total
        // Loop runs from 1 up to the entered number
        for (int i = 1; i <= number; i++) {
            sum += i; // Add the current number to the sum
        }
        return sum; // Return the final sum after the loop finishes
    }
}

// Main class that interacts with the user
public class SumOfNumbers {
    public static void main(String[] args) {
        // Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a positive nonzero integer
        System.out.print("Enter a positive nonzero integer: ");
        int userInput = scanner.nextInt();

        try {
            // Create an object of NumberSummer with the given input
            NumberSummer summer = new NumberSummer(userInput);

            // Call the method to calculate the sum
            int result = summer.calculateSum();

            // Display the result to the user
            System.out.println("The sum of numbers from 1 to " + userInput + " is: " + result);
        } catch (IllegalArgumentException e) {
            // Handle invalid input (like negative numbers or zero)
            System.out.println(e.getMessage());
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}
