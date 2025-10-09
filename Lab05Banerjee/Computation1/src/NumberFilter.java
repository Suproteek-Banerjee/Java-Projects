
public class NumberFilter {

    /**
     * Displays all numbers in an array that are greater than a given number.
     *
     * @param numbers The array of integers.
     * @param n       The number to compare against.
     */
    public void displayLargerThanN(int[] numbers, int n) {
        System.out.println("Numbers greater than " + n + ":");
        for (int number : numbers) {
            if (number > n) {
                System.out.println(number);
            }
        }
    }
}
