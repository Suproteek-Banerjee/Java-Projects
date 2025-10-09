
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee's ID number: ");
        int idNumber = scanner.nextInt();

        Payroll payroll = new Payroll(name, idNumber);

        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();
        payroll.setHourlyPayRate(hourlyPayRate);

        System.out.print("Enter number of hours worked: ");
        double hoursWorked = scanner.nextDouble();
        payroll.setHoursWorked(hoursWorked);

        System.out.println();
        System.out.println("Employee: " + payroll.getName());
        System.out.println("ID Number: " + payroll.getIdNumber());
        System.out.printf("Gross Pay: $%.2f%n", payroll.getGrossPay());

        scanner.close();
    }
}
