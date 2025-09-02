public class tempConv {
    public static void main(String[] args) {

        System.out.println();
        // Print table top border
        System.out.println("+------------+------------+");
        System.out.printf("| %-10s | %-10s |\n", "Fahrenheit", "Centigrade");
        System.out.println("+------------+------------+");

        // Loop for rows with separators
        for (int F = 80; F <= 100; F++) {
            double C = (F - 32) * 5.0 / 9.0;
            System.out.printf("| %-10d | %-10.2f |\n", F, C);

            // Print separator line after each row except last
            if (F < 100) {
                System.out.println("+------------+------------+");
            }
        }

        // Print table bottom border
        System.out.println("+------------+------------+");
    }
}
