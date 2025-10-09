
import java.util.Scanner;

public class NumberFilterTest {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Get the value of n from the user
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Create an instance of NumberFilter
        NumberFilter filter = new NumberFilter();

        // Call the method to display numbers larger than n
        filter.displayLargerThanN(numbers, n);

        // Close the scanner
        scanner.close();
    }
}
