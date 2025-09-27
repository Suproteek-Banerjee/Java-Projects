import java.util.Scanner;

// Class that represents a vehicle's travel
class DistanceTraveled {
    private int speed;   // speed of the vehicle in mph
    private int hours;   // number of hours traveled

    // Constructor
    public DistanceTraveled(int speed, int hours) {
        this.speed = speed;
        this.hours = hours;
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Getter for hours
    public int getHours() {
        return hours;
    }

    // Method to calculate distance for a specific hour
    public int getDistance(int hour) {
        return speed * hour;
    }
}

// Demo program
public class DistanceTraveledDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for speed, validate non-negative
        System.out.print("Enter the speed of the vehicle (in mph): ");
        int speed = sc.nextInt();
        while (speed < 0) {
            System.out.print("Invalid input. Speed cannot be negative. Enter again: ");
            speed = sc.nextInt();
        }

        // Ask user for hours, validate at least 1
        System.out.print("Enter the number of hours traveled: ");
        int hours = sc.nextInt();
        while (hours < 1) {
            System.out.print("Invalid input. Hours must be at least 1. Enter again: ");
            hours = sc.nextInt();
        }

        // Create DistanceTraveled object
        DistanceTraveled trip = new DistanceTraveled(speed, hours);

        // Print report header
        System.out.println("\nHour\tDistance Traveled");
        System.out.println("---------------------------");

        // Loop through each hour and display distance
        for (int h = 1; h <= trip.getHours(); h++) {
            System.out.println(h + "\t" + trip.getDistance(h));
        }
    }
}