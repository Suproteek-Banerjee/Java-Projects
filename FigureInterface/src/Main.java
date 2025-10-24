
public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(5.0);
        Figure triangle = new Triangle(3.0, 4.0);
        Figure rectangle = new Rectangle(5.0, 6.0);

        System.out.println("--- Circle ---");
        circle.printName();
        System.out.println("Number of sides: " + circle.getNumberOfSides());
        System.out.println("Area: " + circle.getArea());
        System.out.println(circle.toString());

        System.out.println("\n--- Triangle ---");
        triangle.printName();
        System.out.println("Number of sides: " + triangle.getNumberOfSides());
        System.out.println("Area: " + triangle.getArea());
        System.out.println(triangle.toString());

        System.out.println("\n--- Rectangle ---");
        rectangle.printName();
        System.out.println("Number of sides: " + rectangle.getNumberOfSides());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println(rectangle.toString());
    }
}
