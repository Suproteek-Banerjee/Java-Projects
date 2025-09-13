/*
Problem 6 ShippingCharges Class
Page 491
**/


public class ShippingCharges {

    /*---------------------------------------------------------
      Instance Variable
    ---------------------------------------------------------*/
    private double weight; // Weight of package in kilograms

    /*---------------------------------------------------------
      Constructor
    ---------------------------------------------------------*/
    public ShippingCharges(double weight) {
        this.weight = weight;
    }

    /*---------------------------------------------------------
      Method: calculateCharges
      Purpose: Calculates total shipping charges based on weight
               and distance (rounded up to nearest 500 miles).
    ---------------------------------------------------------*/
    public double calculateCharges(int distance) {
        // Round up miles to nearest 500
        int units = (int) Math.ceil(distance / 500.0);

        double ratePer500;

        if (weight <= 2) {
            ratePer500 = 1.10;
        } else if (weight <= 6) {
            ratePer500 = 2.20;
        } else if (weight <= 10) {
            ratePer500 = 3.70;
        } else {
            ratePer500 = 4.80;
        }

        return units * ratePer500;
    }

    /*---------------------------------------------------------
      Getters and Setters
    ---------------------------------------------------------*/
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /*---------------------------------------------------------
      Main Method: For Testing
    ---------------------------------------------------------*/
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("   Fast Freight Shipping Cost Calculator");
        System.out.println("============================================");
        System.out.println(" ");
        ShippingCharges pkg1 = new ShippingCharges(2);   // 2kg package
        System.out.println("Package 1 (2 kg, 550 miles): $" + pkg1.calculateCharges(550));


        ShippingCharges pkg2 = new ShippingCharges(8);   // 8kg package
        System.out.println("Package 2 (8 kg, 1200 miles): $" + pkg2.calculateCharges(1200));


        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("   End of Shipping Charges Calculation");
        System.out.println("============================================");
    }
}
