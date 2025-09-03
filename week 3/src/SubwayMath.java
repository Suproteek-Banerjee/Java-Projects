import java.text.DecimalFormat;

public class SubwayMath {
    // Constants
    private static final double DEFAULT_BONUS = 0.15;
    private static final double DEFAULT_RIDE_COST = 2.00;

    // Instance variables
    private double bonus;
    private double rideCost;

    // Decimal formatters
    private static final DecimalFormat moneyFormat = new DecimalFormat("$#,##0.00");
    private static final DecimalFormat percentFormat = new DecimalFormat("0.0%");

    // Default constructor
    public SubwayMath() {
        this.bonus = DEFAULT_BONUS;
        this.rideCost = DEFAULT_RIDE_COST;
    }

    // Non-default constructor
    public SubwayMath(double bonus, double rideCost) {
        this.bonus = bonus;
        this.rideCost = rideCost;
    }

    // Accessors
    public double getBonus() {
        return bonus;
    }

    public double getRideCost() {
        return rideCost;
    }

    // Mutators
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void setRideCost(double rideCost) {
        this.rideCost = rideCost;
    }

    // toString method
    @Override
    public String toString() {
        return "Bonus: " + percentFormat.format(bonus) + " Ride Cost: " + moneyFormat.format(rideCost);
    }

    // Method to calculate optimal amount for one ride count
    public double optimalAmount(int rides) {
        double totalCost = rides * rideCost;
        double amount = totalCost / (1 + bonus); // required amount before bonus
        return Math.round(amount * 100.0) / 100.0; // round to 2 decimal places
    }

    // Method to calculate optimal amount for two ride counts
    public String optimalAmount(int rides1, int rides2) {
        double amt1 = optimalAmount(rides1);
        double amt2 = optimalAmount(rides2);
        return moneyFormat.format(amt1) + "," + moneyFormat.format(amt2);
    }

    // Testing
    public static void main(String[] args) {
        // Default object
        SubwayMath sm = new SubwayMath();
        System.out.println(sm.toString());

        // One ride count
        System.out.println("Optimal for 6 rides: " + sm.optimalAmount(6));

        // Two ride counts
        System.out.println("Optimal for 10 & 20 rides: " + sm.optimalAmount(10, 20));

        // Custom object
        SubwayMath sm2 = new SubwayMath(0.20, 2.50);
        System.out.println(sm2.toString());
        System.out.println("Optimal for 8 rides: " + sm2.optimalAmount(8));
    }
}
