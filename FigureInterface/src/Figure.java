public abstract class Figure implements FigureInterface {

    @Override
    public int getNumberOfSides() {
        return 0; // Default for figures like Circle
    }

    public abstract double getArea();
}
