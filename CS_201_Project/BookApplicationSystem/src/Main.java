
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);

        // Load a sample file at the start
        bookManager.loadBooksFromFile("books.txt");

        System.out.println("\n" +
"************************************************************************\n" +
"*                                                                      *\n" +
"*                   B O O K   A P P L I C A T I O N                    *\n" +
"*                                                                      *\n" +
"*                           S Y S T E M                                *\n" +
"*                                                                      *\n" +
"************************************************************************\n");


        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("==================================================");

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String pTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String pAuthor = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String pGenre = scanner.nextLine();
                    System.out.print("Enter number of pages: ");
                    int pPages = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    bookManager.addBook(new PrintedBook(pTitle, pAuthor, pGenre, pPages));
                    bookManager.saveBooksToFile("books.txt");
                    System.out.println("Printed book added and saved successfully!");
                    break;
                case 2:
                    System.out.print("Enter title: ");
                    String aTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String aAuthor = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String aGenre = scanner.nextLine();
                    System.out.print("Enter length in minutes: ");
                    int aLength = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    bookManager.addBook(new AudioBook(aTitle, aAuthor, aGenre, aLength));
                    bookManager.saveBooksToFile("books.txt");
                    System.out.println("Audio book added and saved successfully!");
                    break;
                case 3:
                    Book.displayLastSixBooks(bookManager.getAllBooks());
                    break;
                case 4:
                    System.out.println("--- Books by Genre ---");
                    Map<String, Long> genreCount = Book.countBooksByGenre(bookManager.getAllBooks());
                    if (genreCount.isEmpty()) {
                        System.out.println("No books to count by genre.");
                    } else {
                        genreCount.forEach((genre, count) -> System.out.println(genre + ": " + count));
                    }
                    break;
                case 5:
                    System.out.println("--- Total Cost of All Books ---");
                    System.out.printf("Total Cost: $%.2f%n", Book.getTotalCost(bookManager.getAllBooks()));
                    break;
                case 6:
                    System.out.println("--- Average Pages of Printed Books ---");
                    System.out.printf("Average Pages: %.2f%n", PrintedBook.getAveragePages(bookManager.getPrintedBooks()));
                    break;
                case 7:
                    System.out.println("--- Last Three Printed Books ---");
                    PrintedBook.displayLastThreePrintedBooks(bookManager.getPrintedBooks());
                    break;
                case 8:
                    System.out.println("--- Average Length of Audiobooks ---");
                    System.out.printf("Average Length: %.2f minutes%n", AudioBook.getAverageLength(bookManager.getAudioBooks()));
                    break;
                case 9:
                    System.out.println("--- Last Three Audiobooks ---");
                    AudioBook.displayLastThreeAudioBooks(bookManager.getAudioBooks());
                    break;
                case 10:
                    bookManager.saveBooksToFile("books.txt");
                    break;
                case 11:
                    System.out.println("Exiting... Thank you for using the Book Application System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("==================================================");
        }
    }

    private static void printMenu() {
        System.out.println("\n+------------------------------------------------+");
        System.out.println("|          Book Application System Menu          |");
        System.out.println("+------------------------------------------------+");
        System.out.println("| 1. Add a Printed Book                          |");
        System.out.println("| 2. Add an Audio Book                           |");
        System.out.println("| 3. Display last six books                      |");
        System.out.println("| 4. Display number of books by genre            |");
        System.out.println("| 5. Display total cost of all books             |");
        System.out.println("| 6. Display average pages of printed books      |");
        System.out.println("| 7. Display last three printed books            |");
        System.out.println("| 8. Display average length of audiobooks        |");
        System.out.println("| 9. Display last three audiobooks               |");
        System.out.println("| 10. Save books to file                         |");
        System.out.println("| 11. Exit                                       |");
        System.out.println("+------------------------------------------------+");
        System.out.print("Enter your choice: ");
    }
}
