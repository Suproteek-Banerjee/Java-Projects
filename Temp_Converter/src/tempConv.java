public class tempConv {  // Define a public class named tempConv
    public static void main(String[] args) {  // Main method: program execution starts here

        System.out.println();  // Print a blank line for spacing

        // Printing the top border of the table
        System.out.println("+------------+------------+");

        // Printing the table headers ("Fahrenheit" and "Centigrade") with formatting
        System.out.printf("| %-10s | %-10s |\n", "Fahrenheit", "Centigrade");

        // Printing the border below the header row
        System.out.println("+------------+------------+");

        // Looping through Fahrenheit values from 80 to 100 (inclusive)
        for (int F = 80; F <= 100; F++) {

            // Converting Fahrenheit (F) to Celsius (C) using formula
            double C = (F - 32) * 5.0 / 9.0;

            // Printing the Fahrenheit and Celsius values in table row format
            // %-10d = left-align integer in 10 spaces
            // %-10.2f = left-align floating number with 2 decimal places in 10 spaces
            System.out.printf("| %-10d | %-10.2f |\n", F, C);

            // Printing separator line after each row, except the last one
            if (F < 100) {
                System.out.println("+------------+------------+");
            }
        }

        // Printing the bottom border of the table after all rows are done
        System.out.println("+------------+------------+");
    }
}