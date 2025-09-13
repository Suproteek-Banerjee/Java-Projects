/*
======================================================
   Freezing and Boiling Points Checker
   Description:
   - Checks whether Ethyl Alcohol, Oxygen, and Water
     will freeze or boil at a given temperature.
======================================================
*/

import java.util.Scanner;

class FreezingBoilingPoints {
    private double temperature;

    // Constructor
    public FreezingBoilingPoints(double temperature) {
        this.temperature = temperature;
    }

    // Accessor & Mutator
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Methods for Ethyl Alcohol
    public boolean isEthylFreezing() {
        return temperature <= -173;
    }

    public boolean isEthylBoiling() {
        return temperature >= 172;
    }

    // Methods for Oxygen
    public boolean isOxygenFreezing() {
        return temperature <= -362;
    }

    public boolean isOxygenBoiling() {
        return temperature >= -306;
    }

    // Methods for Water
    public boolean isWaterFreezing() {
        return temperature <= 32;
    }

    public boolean isWaterBoiling() {
        return temperature >= 212;
    }
}

public class FreezingBoilingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ASCII Banner
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("   🌡️  Freezing and Boiling Point Checker  ");
        System.out.println("============================================");

        // Input temperature
        System.out.print("\nEnter a temperature in Fahrenheit: ");
        double temp = sc.nextDouble();

        FreezingBoilingPoints fb = new FreezingBoilingPoints(temp);

        System.out.println("\n============================================");
        System.out.println("   Results for temperature: " + temp + "°F");
        System.out.println("============================================");

        // Check freezing
        System.out.println("\n❄️  Substances that will FREEZE:");
        boolean freezeFlag = false;
        if (fb.isEthylFreezing()) { System.out.println(" - Ethyl Alcohol"); freezeFlag = true; }
        if (fb.isOxygenFreezing()) { System.out.println(" - Oxygen"); freezeFlag = true; }
        if (fb.isWaterFreezing())  { System.out.println(" - Water"); freezeFlag = true; }
        if (!freezeFlag) System.out.println(" (None)");

        // Check boiling
        System.out.println("\n🔥 Substances that will BOIL:");
        boolean boilFlag = false;
        if (fb.isEthylBoiling()) { System.out.println(" - Ethyl Alcohol"); boilFlag = true; }
        if (fb.isOxygenBoiling()) { System.out.println(" - Oxygen"); boilFlag = true; }
        if (fb.isWaterBoiling())  { System.out.println(" - Water"); boilFlag = true; }
        if (!boilFlag) System.out.println(" (None)");

        System.out.println("\n============================================");
        System.out.println("   ✅ Check Complete. Stay curious! ");
        System.out.println("============================================");

        sc.close();
    }
}
