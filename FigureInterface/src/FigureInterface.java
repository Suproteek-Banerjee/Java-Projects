
public interface FigureInterface {
    default void printName() {
        System.out.println("Figure: " + getClass().getSimpleName());
    }

    int getNumberOfSides();
}
