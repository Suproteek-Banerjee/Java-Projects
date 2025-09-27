import java.util.Scanner;
import java.text.DecimalFormat;

class Hotel {
    private int totalFloors;
    private int totalRooms;
    private int totalOccupied;

    // Constructor to initialize the hotel with floors
    public Hotel(int floors) {
        totalFloors = floors;
        totalRooms = 0;
        totalOccupied = 0;
    }

    // Method to add room and occupied count for a floor
    public void addFloorData(int rooms, int occupied) {
        totalRooms += rooms;
        totalOccupied += occupied;
    }

    // Method to calculate total vacant rooms
    public int getVacantRooms() {
        return totalRooms - totalOccupied;
    }

    // Method to calculate overall occupancy rate
    public double getOccupancyRate() {
        return (double) totalOccupied / totalRooms;
    }

    // Method to display final report
    public void displayReport() {
        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.println("\n--- Hotel Occupancy Report ---");
        System.out.println("Total Rooms   : " + totalRooms);
        System.out.println("Occupied Rooms: " + totalOccupied);
        System.out.println("Vacant Rooms  : " + getVacantRooms());
        System.out.println("Occupancy Rate: " + df.format(getOccupancyRate()));
    }
}

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for number of floors
        System.out.print("Enter the number of floors: ");
        int floors = sc.nextInt();

        // Validation: Floors must be >= 1
        while (floors < 1) {
            System.out.print("Invalid! Number of floors must be at least 1. Try again: ");
            floors = sc.nextInt();
        }

        Hotel hotel = new Hotel(floors);

        // Step 2: Loop through each floor to get room details
        for (int i = 1; i <= floors; i++) {
            System.out.print("\nEnter number of rooms on floor " + i + ": ");
            int rooms = sc.nextInt();

            // Validation: At least 10 rooms per floor
            while (rooms < 10) {
                System.out.print("Invalid! Each floor must have at least 10 rooms. Try again: ");
                rooms = sc.nextInt();
            }

            System.out.print("Enter number of occupied rooms on floor " + i + ": ");
            int occupied = sc.nextInt();

            // Validation: Occupied cannot exceed total rooms
            while (occupied < 0 || occupied > rooms) {
                System.out.print("Invalid! Occupied rooms must be between 0 and " + rooms + ". Try again: ");
                occupied = sc.nextInt();
            }

            hotel.addFloorData(rooms, occupied);
        }

        // Step 3: Display final report
        hotel.displayReport();

        sc.close();
    }
}
