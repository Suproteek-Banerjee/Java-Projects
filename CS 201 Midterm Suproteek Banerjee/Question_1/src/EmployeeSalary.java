public record EmployeeSalary(String name, String id, double grossSalary) {

    public double calculateDeduction() {
        if (grossSalary < 20000) {
            return grossSalary * 0.05;
        } else if (grossSalary <= 40000) {
            return grossSalary * 0.10;
        } else if (grossSalary <= 70000) {
            return grossSalary * 0.15;
        } else {
            return grossSalary * 0.20;
        }
    }

    private String getDeductionPercentage() {
        if (grossSalary < 20000) {
            return "5%";
        } else if (grossSalary <= 40000) {
            return "10%";
        } else if (grossSalary <= 70000) {
            return "15%";
        } else {
            return "20%";
        }
    }

    public double getAdjustedSalary() {
        return grossSalary - calculateDeduction();
    }

    public double calculateTax() {
        return getAdjustedSalary() * 0.10;
    }

    public void displaySalaryDetails() {
        System.out.println("\nEmployee Salary Details:");
        System.out.println("----------------------");
        System.out.printf("Employee ID: %s%n", id());
        System.out.printf("Employee Name: %s%n", name());
        System.out.printf("Gross Salary: $%.2f%n", grossSalary());
        System.out.printf("Deduction (%s): $%.2f%n", getDeductionPercentage(), calculateDeduction());
        System.out.printf("Adjusted Salary: $%.2f%n", getAdjustedSalary());
        System.out.printf("Tax (10%%): $%.2f%n", calculateTax());
        System.out.println("----------------------");
        System.out.printf("Net Salary: $%.2f%n", (getAdjustedSalary() - calculateTax()));
        System.out.println("----------------------");
    }
}
