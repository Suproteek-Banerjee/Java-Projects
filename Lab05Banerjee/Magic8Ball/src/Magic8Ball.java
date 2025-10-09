import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {
        // Create an ArrayList to store the responses from the file.
        ArrayList<String> responses = new ArrayList<>();

        try {
            // Create a File object for the response file.
            File file = new File("src/8_ball_responses.txt");

            // Create a Scanner to read the file.
            Scanner fileScanner = new Scanner(file);

            // Read each line from the file and add it to the ArrayList.
            while (fileScanner.hasNextLine()) {
                responses.add(fileScanner.nextLine());
            }

            // Close the file scanner.
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: Response file not found.");
            return; // Exit the program if the file is not found.
        }

        // Create a Scanner to get input from the user.
        Scanner keyboard = new Scanner(System.in);

        // Create a Random object to generate random numbers.
        Random random = new Random();

        // Loop until the user enters "quit".
        while (true) {
            // Prompt the user to ask a question.
            System.out.print("Ask a yes or no question (or type 'quit' to exit): ");
            String question = keyboard.nextLine();

            // Check if the user wants to quit.
            if (question.equalsIgnoreCase("quit")) {
                break;
            }

            // Get a random index from the responses ArrayList.
            int randomIndex = random.nextInt(responses.size());

            // Get the random response from the ArrayList.
            String randomResponse = responses.get(randomIndex);

            // Print the random response.
            System.out.println(randomResponse);
            System.out.println();
        }

        // Close the keyboard scanner.
        keyboard.close();
    }
}
