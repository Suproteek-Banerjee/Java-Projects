
public class Rainfall {
    private double[] monthlyRainfall;
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    public Rainfall(double[] rainfall) {
        if (rainfall.length != 12) {
            throw new IllegalArgumentException("Rainfall data must contain 12 months.");
        }
        this.monthlyRainfall = new double[12];
        for (int i = 0; i < 12; i++) {
            if (rainfall[i] < 0) {
                throw new IllegalArgumentException("Rainfall cannot be negative for " + MONTH_NAMES[i] + ".");
            }
            this.monthlyRainfall[i] = rainfall[i];
        }
    }

    public double getTotalRainfall() {
        double total = 0;
        for (double rain : monthlyRainfall) {
            total += rain;
        }
        return total;
    }

    public double getAverageMonthlyRainfall() {
        return getTotalRainfall() / 12.0;
    }

    public String getMonthWithMostRain() {
        if (monthlyRainfall.length == 0) {
            return "No data";
        }
        double maxRain = monthlyRainfall[0];
        int maxMonthIndex = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] > maxRain) {
                maxRain = monthlyRainfall[i];
                maxMonthIndex = i;
            }
        }
        return MONTH_NAMES[maxMonthIndex];
    }

    public String getMonthWithLeastRain() {
        if (monthlyRainfall.length == 0) {
            return "No data";
        }
        double minRain = monthlyRainfall[0];
        int minMonthIndex = 0;
        for (int i = 1; i < monthlyRainfall.length; i++) {
            if (monthlyRainfall[i] < minRain) {
                minRain = monthlyRainfall[i];
                minMonthIndex = i;
            }
        }
        return MONTH_NAMES[minMonthIndex];
    }
}
