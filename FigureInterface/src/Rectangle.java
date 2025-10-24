
public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public int getNumberOfSides() {
        return 4;
    }

    @Override
    public String toString() {
        return "Rectangle with length: " + length + " and width: " + width;
    }
}
