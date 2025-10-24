
import java.util.List;

public class AudioBook extends AbstractBook {
    private int lengthInMinutes;
    private static final double COST_PER_MINUTE = 10.0 / 2; // Half the cost of a single page

    // Constructor for loading from file
    public AudioBook(String title, String author, String genre, double cost, int lengthInMinutes) {
        super(title, author, genre, cost);
        this.lengthInMinutes = lengthInMinutes;
    }

    // Constructor for creating new books (calculates cost)
    public AudioBook(String title, String author, String genre, int lengthInMinutes) {
        super(title, author, genre, lengthInMinutes * COST_PER_MINUTE);
        this.lengthInMinutes = lengthInMinutes;
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public static double getAverageLength(List<AudioBook> audioBooks) {
        if (audioBooks == null || audioBooks.isEmpty()) {
            return 0;
        }
        return audioBooks.stream()
                .mapToInt(AudioBook::getLengthInMinutes)
                .average()
                .orElse(0);
    }

    public static void displayLastThreeAudioBooks(List<AudioBook> audioBooks) {
        System.out.println("--- Displaying Last Three Audiobooks ---");
        int startIndex = Math.max(0, audioBooks.size() - 3);
        for (int i = startIndex; i < audioBooks.size(); i++) {
            System.out.println("----------------------------------------");
            System.out.println(audioBooks.get(i));
        }
        System.out.println("----------------------------------------");
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nGenre: %s\nLength: %d minutes\nCost: $%.2f",
                title, author, genre, lengthInMinutes, getCost());
    }
}
