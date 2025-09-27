import java.util.Scanner;

// Payroll class
class Payroll {
    // Fields (encapsulation: private)
    private String name;
    private String idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    // Constructor: initializes name and ID
    public Payroll(String name, String idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Accessor (get) methods
    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Mutator (set) methods
    public void setHourlyPayRate(double hourlyPayRate) {
        if (hourlyPayRate > 0) {
            this.hourlyPayRate = hourlyPayRate;
        } else {
            System.out.println("Hourly pay rate must be positive.");
        }
    }

    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        } else {
            System.out.println("Hours worked cannot be negative.");
        }
    }

    // Method to calculate gross pay
    public double getGrossPay() {
        return hoursWorked * hourlyPayRate;
    }
}

// Main program to demonstrate Payroll class
public class PayrollDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee name and ID for constructor
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee's ID number: ");
        String id = scanner.nextLine();

        // Create Payroll object
        Payroll employee = new Payroll(name, id);

        // Get hourly pay rate and hours worked
        System.out.print("Enter hourly pay rate: ");
        double rate = scanner.nextDouble();
        employee.setHourlyPayRate(rate);

        System.out.print("Enter number of hours worked: ");
        double hours = scanner.nextDouble();
        employee.setHoursWorked(hours);

        // Display gross pay
        System.out.println("\n--- Payroll Summary ---");
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getIdNumber());
        System.out.printf("Gross Pay: $%.2f%n", employee.getGrossPay());

        scanner.close();
    }
}
