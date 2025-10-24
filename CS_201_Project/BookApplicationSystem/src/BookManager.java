
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> allBooks = new ArrayList<>();
    private List<PrintedBook> printedBooks = new ArrayList<>();
    private List<AudioBook> audioBooks = new ArrayList<>();

    public void addBook(Book book) {
        // Avoid adding duplicates when loading from file initially
        if (allBooks.stream().noneMatch(b -> b.toString().equals(book.toString()))) {
            allBooks.add(book);
            if (book instanceof PrintedBook) {
                printedBooks.add((PrintedBook) book);
            } else if (book instanceof AudioBook) {
                audioBooks.add((AudioBook) book);
            }
        }
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }

    public List<PrintedBook> getPrintedBooks() {
        return printedBooks;
    }

    public List<AudioBook> getAudioBooks() {
        return audioBooks;
    }

    public void loadBooksFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine(); // Skip header
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");
                String title = parts[0];
                String author = parts[1];
                String genre = parts[2];
                double cost = (parts[3] == null || parts[3].isEmpty() || parts[3].equalsIgnoreCase("N/A")) ? 0.0 : Double.parseDouble(parts[3]);
                String lengthStr = parts[4];
                String pagesStr = parts[5];
                String bookType = parts[6];

                if ("printedBook".equalsIgnoreCase(bookType)) {
                    int pages = (pagesStr == null || pagesStr.isEmpty() || pagesStr.equalsIgnoreCase("N/A")) ? 0 : Integer.parseInt(pagesStr);
                    addBook(new PrintedBook(title, author, genre, cost, pages));
                } else if ("audioBook".equalsIgnoreCase(bookType)) {
                    int length = (lengthStr == null || lengthStr.isEmpty() || lengthStr.equalsIgnoreCase("N/A")) ? 0 : Integer.parseInt(lengthStr);
                    addBook(new AudioBook(title, author, genre, cost, length));
                }
            }
            System.out.println("Books loaded from " + filePath);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error loading books from file: " + e.getMessage());
        }
    }

    public void saveBooksToFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("title,author,genre,cost,length,pages,booktype");
            writer.newLine();

            for (Book book : allBooks) {
                if (book instanceof PrintedBook) {
                    PrintedBook pBook = (PrintedBook) book;
                    String line = String.format("%s,%s,%s,%.2f,N/A,%d,printedBook",
                            pBook.title, pBook.author, pBook.genre, pBook.getCost(), pBook.getNumberOfPages());
                    writer.write(line);
                    writer.newLine();
                } else if (book instanceof AudioBook) {
                    AudioBook aBook = (AudioBook) book;
                    String line = String.format("%s,%s,%s,%.2f,%d,N/A,audioBook",
                            aBook.title, aBook.author, aBook.genre, aBook.getCost(), aBook.getLengthInMinutes());
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Books saved to " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving books to file: " + e.getMessage());
        }
    }
}
