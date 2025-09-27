import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMenu {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Variable to store user choice
        int choice = -1;

        // Loop until the user chooses EXIT (choice = 6)
        while (choice != 6) {
            // Display menu options
            System.out.println("\n===== LinkedList Menu =====");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Search for an element");
            System.out.println("4. Display the list");
            System.out.println("5. Get size of the list");
            System.out.println("6. EXIT");
            System.out.print("Enter your choice: ");

            try {
                // Read the user's choice (integer input)
                choice = scanner.nextInt();
                scanner.nextLine(); // consume the newline left after nextInt()

                // Perform operation based on user choice
                switch (choice) {
                    case 1:
                        // Add element to the list
                        System.out.print("Enter element to add: ");
                        String elementToAdd = scanner.nextLine();
                        list.add(elementToAdd); // LinkedList add() method
                        System.out.println("Element added successfully!");
                        break;

                    case 2:
                        // Remove element from the list
                        if (list.isEmpty()) {
                            // If list is empty, we cannot remove
                            System.out.println("List is empty. Nothing to remove.");
                        } else {
                            System.out.print("Enter element to remove: ");
                            String elementToRemove = scanner.nextLine();
                            // remove() returns true if the element was found and removed
                            if (list.remove(elementToRemove)) {
                                System.out.println("Element removed successfully!");
                            } else {
                                System.out.println("Element not found in the list.");
                            }
                        }
                        break;

                    case 3:
                        // Search for an element
                        if (list.isEmpty()) {
                            System.out.println("List is empty. Cannot search.");
                        } else {
                            System.out.print("Enter element to search: ");
                            String elementToSearch = scanner.nextLine();
                            // contains() checks if element exists in the list
                            if (list.contains(elementToSearch)) {
                                System.out.println("Element found in the list.");
                            } else {
                                System.out.println("Element not found.");
                            }
                        }
                        break;

                    case 4:
                        // Display all elements of the list
                        if (list.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {
                            System.out.println("List contents: " + list);
                        }
                        break;

                    case 5:
                        // Show the size of the list
                        System.out.println("Size of the list: " + list.size());
                        break;

                    case 6:
                        // Exit the program
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        // If user enters a number outside 1–6
                        System.out.println("Invalid choice. Please select a valid option (1–6).");
                }
            }
            // Exception handling for invalid inputs
            catch (InputMismatchException e) {
                // If user enters something that is not an integer
                System.out.println("Invalid input! Please enter a number between 1 and 6.");
                scanner.nextLine(); // clear the invalid input from scanner buffer
            }
            catch (Exception e) {
                // Catch any other unexpected errors
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }

        // Close the scanner at the end of the program
        scanner.close();
    }
}
