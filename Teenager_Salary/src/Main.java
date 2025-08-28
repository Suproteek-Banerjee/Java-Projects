//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double base_salary = 40;
        double hourly_rate = 11.25;
        double hours = -2;

        double gross_salary;

        // calculating the gross salary

        gross_salary = base_salary + (hourly_rate * hours);

        System.out.println("Your Gross Salary Is: $" + gross_salary);
        }
    }
