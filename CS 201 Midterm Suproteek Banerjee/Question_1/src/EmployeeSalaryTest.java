import java.util.Scanner;

public class EmployeeSalaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter gross salary: ");
        double grossSalary = scanner.nextDouble();

        EmployeeSalary employee = new EmployeeSalary(name, id, grossSalary);

        employee.displaySalaryDetails();

        scanner.close();
    }
}
