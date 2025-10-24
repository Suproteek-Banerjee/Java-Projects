
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface Book {

    static void displayLastSixBooks(List<Book> books) {
        System.out.println("--- Displaying Last Six Books ---");
        if (books.isEmpty()) {
            System.out.println("No books to display.");
            return;
        }
        int startIndex = Math.max(0, books.size() - 6);
        for (int i = startIndex; i < books.size(); i++) {
            System.out.println("----------------------------------------");
            System.out.println(books.get(i));
        }
        System.out.println("----------------------------------------");
    }

    static Map<String, Long> countBooksByGenre(List<Book> books) {
        if (books == null || books.isEmpty()) {
            return Collections.emptyMap();
        }
        return books.stream()
                .filter(b -> b instanceof AbstractBook)
                .map(b -> ((AbstractBook) b).getGenre())
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()));
    }

    static double getTotalCost(List<Book> books) {
        if (books == null || books.isEmpty()) {
            return 0.0;
        }
        return books.stream()
                .filter(b -> b instanceof AbstractBook)
                .mapToDouble(b -> ((AbstractBook) b).getCost())
                .sum();
    }
}
