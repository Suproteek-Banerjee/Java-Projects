
import java.util.List;

public class PrintedBook extends AbstractBook {
    private int numberOfPages;
    private static final double COST_PER_PAGE = 10.0;

    // Constructor for loading from file
    public PrintedBook(String title, String author, String genre, double cost, int numberOfPages) {
        super(title, author, genre, cost);
        this.numberOfPages = numberOfPages;
    }

    // Constructor for creating new books (calculates cost)
    public PrintedBook(String title, String author, String genre, int numberOfPages) {
        super(title, author, genre, numberOfPages * COST_PER_PAGE);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public static double getAveragePages(List<PrintedBook> printedBooks) {
        if (printedBooks == null || printedBooks.isEmpty()) {
            return 0;
        }
        return printedBooks.stream()
                .mapToInt(PrintedBook::getNumberOfPages)
                .average()
                .orElse(0);
    }

    public static void displayLastThreePrintedBooks(List<PrintedBook> printedBooks) {
        System.out.println("--- Displaying Last Three Printed Books ---");
        int startIndex = Math.max(0, printedBooks.size() - 3);
        for (int i = startIndex; i < printedBooks.size(); i++) {
            System.out.println("----------------------------------------");
            System.out.println(printedBooks.get(i));
        }
        System.out.println("----------------------------------------");
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nGenre: %s\nPages: %d\nCost: $%.2f",
                title, author, genre, numberOfPages, getCost());
    }
}
