
public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public int getNumberOfSides() {
        return 3;
    }

    @Override
    public String toString() {
        return "Triangle with base: " + base + " and height: " + height;
    }
}
