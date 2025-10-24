
public abstract class AbstractBook implements Book {
    protected String title;
    protected String author;
    protected String genre;
    protected double cost;

    public AbstractBook(String title, String author, String genre, double cost) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getGenre() {
        return genre;
    }
}
