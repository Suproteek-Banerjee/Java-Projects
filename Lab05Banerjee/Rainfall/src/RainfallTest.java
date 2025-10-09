import java.util.Scanner;

public class RainfallTest {
    public static void main(String[] args) {
        double[] monthlyRainfalls = new double[12];
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter rainfall for " + monthNames[i] + ": ");
            double rain = scanner.nextDouble();
            while (rain < 0) {
                System.out.print("Invalid input. Please enter a non-negative rainfall amount: ");
                rain = scanner.nextDouble();
            }
            monthlyRainfalls[i] = rain;
        }

        try {
            Rainfall rainfall = new Rainfall(monthlyRainfalls);

            System.out.println("\nTotal Rainfall for the Year: " + rainfall.getTotalRainfall());
            System.out.printf("Average Monthly Rainfall: %.2f\n", rainfall.getAverageMonthlyRainfall());
            System.out.println("Month with the Most Rain: " + rainfall.getMonthWithMostRain());
            System.out.println("Month with the Least Rain: " + rainfall.getMonthWithLeastRain());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
