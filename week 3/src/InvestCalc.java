import java.text.DecimalFormat;

public class InvestCalc {
    // Instance variables
    private double principal;
    private double interestRate; // decimal format e.g., 0.05 for 5%

    // Formatters for money and percentage
    private static final DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");
    private static final DecimalFormat percentFormat = new DecimalFormat("0.00%");

    // Default constructor (sets principal and rate to zero)
    public InvestCalc() {
        this.principal = 0.0;
        this.interestRate = 0.0;
    }

    // Non-default constructor
    public InvestCalc(double principal, double interestRate) {
        this.principal = principal;
        this.interestRate = interestRate;
    }

    // Accessors (getters)
    public double getPrincipal() {
        return principal;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // Mutators (setters)
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // toString method with formatting
    @Override
    public String toString() {
        return "Principal: " + moneyFormat.format(principal) +
                " Interest rate: " + percentFormat.format(interestRate);
    }

    // Method to calculate future value for given years
    public double futureValue(int years) {
        return principal * Math.pow(1 + interestRate, years);
    }

    // Method to return semicolon-delimited table for 5, 10, and 20 years
    public String getTable() {
        int[] years = {5, 10, 20};
        StringBuilder table = new StringBuilder();

        for (int year : years) {
            double fv = futureValue(year);
            table.append(moneyFormat.format(principal))
                    .append(";")
                    .append(percentFormat.format(interestRate))
                    .append(";")
                    .append(year)
                    .append(";")
                    .append(moneyFormat.format(fv))
                    .append("\n");
        }
        return table.toString();
    }

    // Main method to test all cases
    public static void main(String[] args) {
        // Test object with $10,000 principal and 5% interest rate
        InvestCalc investment = new InvestCalc(10000.0, 0.05);

        // Print object details
        System.out.println(investment.toString());
        System.out.println();

        // Print future value table
        System.out.println(investment.getTable());

        // Testing mutators
        investment.setPrincipal(20000.0);
        investment.setInterestRate(0.065);
        System.out.println(investment.toString());
        System.out.println(investment.getTable());
    }
}
