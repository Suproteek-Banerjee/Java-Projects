import java.util.Scanner;

public class ComputationTest {
    public static void main(String[] args) {
        Computation computation = new Computation();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter positive integers (0 to stop):");

        while (true) {
            try {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                computation.add(number);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid input
            }
        }

        System.out.println("Sum: " + computation.getSum());
        System.out.println("Average: " + computation.getAverage());

        scanner.close();
    }
}
