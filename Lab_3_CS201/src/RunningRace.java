import java.util.Scanner;

public class RunningRace {

    // Instance variables
    private String runner1, runner2, runner3;
    private double time1, time2, time3;

    // Constructor
    public RunningRace(String runner1, double time1, String runner2, double time2, String runner3, double time3) {
        this.runner1 = runner1;
        this.time1 = time1;
        this.runner2 = runner2;
        this.time2 = time2;
        this.runner3 = runner3;
        this.time3 = time3;
    }

    // Method to get 1st place
    public String getFirstPlace() {
        if (time1 < time2 && time1 < time3) {
            return runner1;
        } else if (time2 < time1 && time2 < time3) {
            return runner2;
        } else {
            return runner3;
        }
    }

    // Method to get 2nd place
    public String getSecondPlace() {
        if ((time1 > time2 && time1 < time3) || (time1 < time2 && time1 > time3)) {
            return runner1;
        } else if ((time2 > time1 && time2 < time3) || (time2 < time1 && time2 > time3)) {
            return runner2;
        } else {
            return runner3;
        }
    }

    // Method to get 3rd place
    public String getThirdPlace() {
        if (time1 > time2 && time1 > time3) {
            return runner1;
        } else if (time2 > time1 && time2 > time3) {
            return runner2;
        } else {
            return runner3;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Header
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("         Running the Race - Analyzer         ");
        System.out.println("============================================");

        // Get input for 3 runners
        System.out.print("Enter name of runner 1: ");
        String r1 = input.nextLine();
        System.out.print("Enter time (in minutes) for " + r1 + ": ");
        double t1 = input.nextDouble();
        input.nextLine(); // consume newline

        System.out.print("Enter name of runner 2: ");
        String r2 = input.nextLine();
        System.out.print("Enter time (in minutes) for " + r2 + ": ");
        double t2 = input.nextDouble();
        input.nextLine(); // consume newline

        System.out.print("Enter name of runner 3: ");
        String r3 = input.nextLine();
        System.out.print("Enter time (in minutes) for " + r3 + ": ");
        double t3 = input.nextDouble();

        // Create object
        RunningRace race = new RunningRace(r1, t1, r2, t2, r3, t3);

        // Output results
        System.out.println("\n--------------------------------------------");
        System.out.println("                 Race Results                ");
        System.out.println("--------------------------------------------");
        System.out.println("1st Place: 🥇 " + race.getFirstPlace());
        System.out.println("2nd Place: 🥈 " + race.getSecondPlace());
        System.out.println("3rd Place: 🥉 " + race.getThirdPlace());
        System.out.println("--------------------------------------------");
        System.out.println("             End of Race Analysis            ");
        System.out.println("============================================");

        input.close();
    }
}