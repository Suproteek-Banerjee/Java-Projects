import java.util.Scanner;

public class FatGram {

    /*---------------------------------------------------------
      Instance Variables
    ---------------------------------------------------------*/
    private double calories;
    private double fatGrams;

    /*---------------------------------------------------------
      Constructor
    ---------------------------------------------------------*/
    public FatGram(double calories, double fatGrams) {
        this.calories = calories;
        this.fatGrams = fatGrams;
    }

    /*---------------------------------------------------------
      Method: getCaloriesFromFat
      Purpose: Calculates total calories from fat grams
    ---------------------------------------------------------*/
    public double getCaloriesFromFat() {
        return fatGrams * 9;
    }

    /*---------------------------------------------------------
      Method: getFatPercentage
      Purpose: Calculates percentage of calories from fat
    ---------------------------------------------------------*/
    public double getFatPercentage() {
        if (calories <= 0) {
            return 0; // Avoid division by zero
        }
        return (getCaloriesFromFat() / calories) * 100;
    }

    /*---------------------------------------------------------
      Method: isValid
      Purpose: Validates that calories from fat do not exceed
               total calories.
    ---------------------------------------------------------*/
    public boolean isValid() {
        return getCaloriesFromFat() <= calories;
    }

    /*---------------------------------------------------------
      Method: isLowFat
      Purpose: Checks if food is low fat (< 30%)
    ---------------------------------------------------------*/
    public boolean isLowFat() {
        return getFatPercentage() < 30;
    }

    /*---------------------------------------------------------
      Main Method: Demonstration
    ---------------------------------------------------------*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display Header
        System.out.println(" ");
        System.out.println("============================================");
        System.out.println("         FatGram - Nutrition Analyzer        ");
        System.out.println("============================================");

        // User Input
        System.out.print("Enter the number of calories: ");
        double calories = input.nextDouble();

        System.out.print("Enter the number of fat grams: ");
        double fatGrams = input.nextDouble();

        // Create FatGram object
        FatGram food = new FatGram(calories, fatGrams);

        System.out.println("\n--------------------------------------------");
        System.out.println("               Analysis Report               ");
        System.out.println("--------------------------------------------");

        // Validation
        if (!food.isValid()) {
            System.out.println("Error: Calories from fat cannot exceed total calories.");
        } else {
            System.out.printf("Total Calories: %.2f cal\n", calories);
            System.out.printf("Fat Calories : %.2f cal\n", food.getCaloriesFromFat());
            System.out.printf("Fat Percentage: %.2f%%\n", food.getFatPercentage());

            if (food.isLowFat()) {
                System.out.println("This food is low in fat.");
            } else {
                System.out.println("This food has a moderate/high fat content.");
            }
        }

        System.out.println("--------------------------------------------");
        System.out.println("         End of Nutrition Analysis           ");
        System.out.println("============================================");

        input.close();
    }
}