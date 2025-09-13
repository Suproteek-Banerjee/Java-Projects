import java.util.Scanner;

/*=========================================================
   Class: SpeedOfSound
   Purpose: Models sound wave travel time in different media
=========================================================*/
public class SpeedOfSound {

    private double distance; // in feet

    public SpeedOfSound(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTimeInAir() {
        return distance / 1100.0;
    }

    public double getTimeInWater() {
        return distance / 4900.0;
    }

    public double getTimeInSteel() {
        return distance / 16400.0;
    }

    /*---------------------------------------------------------
      Main Method: Demonstration with Menu
    ---------------------------------------------------------*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("         Speed of Sound - Calculator         ");
        System.out.println("============================================");
        System.out.println("Select a medium for sound travel:");
        System.out.println("1. Air");
        System.out.println("2. Water");
        System.out.println("3. Steel");
        System.out.println("============================================");
        System.out.print("Enter your choice (1-3): ");
        int choice = input.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("\nError: Invalid selection! Please restart and choose 1, 2, or 3.");
            input.close();
            return;
        }

        System.out.print("Enter the distance sound will travel (in feet): ");
        double distance = input.nextDouble();

        SpeedOfSound sound = new SpeedOfSound(distance);

        System.out.println("\n--------------------------------------------");
        System.out.println("                Travel Report                ");
        System.out.println("--------------------------------------------");

        switch (choice) {
            case 1:
                System.out.printf("Medium: Air\nDistance: %.2f feet\nTime: %.6f seconds\n",
                        distance, sound.getTimeInAir());
                break;
            case 2:
                System.out.printf("Medium: Water\nDistance: %.2f feet\nTime: %.6f seconds\n",
                        distance, sound.getTimeInWater());
                break;
            case 3:
                System.out.printf("Medium: Steel\nDistance: %.2f feet\nTime: %.6f seconds\n",
                        distance, sound.getTimeInSteel());
                break;
        }

        System.out.println("--------------------------------------------");
        System.out.println("           End of Speed Calculation          ");
        System.out.println("============================================");

        input.close();
    }
}
