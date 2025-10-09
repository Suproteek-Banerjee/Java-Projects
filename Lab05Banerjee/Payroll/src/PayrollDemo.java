
import java.util.Scanner;

public class PayrollDemo {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        Scanner scanner = new Scanner(System.in);

        int[] employeeIds = payroll.getEmployeeId();
        int[] hours = payroll.getHours();
        double[] payRate = payroll.getPayRate();

        for (int i = 0; i < employeeIds.length; i++) {
            System.out.print("Enter hours worked for employee " + employeeIds[i] + ": ");
            int h = scanner.nextInt();
            while (h < 0) {
                System.out.print("Hours cannot be negative. Please re-enter: ");
                h = scanner.nextInt();
            }
            hours[i] = h;

            System.out.print("Enter pay rate for employee " + employeeIds[i] + ": ");
            double p = scanner.nextDouble();
            while (p < 6.00) {
                System.out.print("Pay rate cannot be less than 6.00. Please re-enter: ");
                p = scanner.nextDouble();
            }
            payRate[i] = p;
        }

        payroll.setHours(hours);
        payroll.setPayRate(payRate);

        System.out.println("\nEmployee Gross Wages:");
        for (int id : employeeIds) {
            System.out.printf("Employee ID: %d, Gross Wages: $%.2f\n", id, payroll.getGrossPay(id));
        }
    }
}
