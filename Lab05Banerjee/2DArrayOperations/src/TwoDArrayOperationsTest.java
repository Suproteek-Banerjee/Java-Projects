public class TwoDArrayOperationsTest {
    public static void main(String[] args) {
        // Test data
        int[][] intArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] floatArray = {{1.1f, 2.2f, 3.3f}, {4.4f, 5.5f, 6.6f}, {7.7f, 8.8f, 9.9f}};
        double[][] doubleArray = {{1.11, 2.22, 3.33}, {4.44, 5.55, 6.66}, {7.77, 8.88, 9.99}};
        long[][] longArray = {{10L, 20L, 30L}, {40L, 50L, 60L}, {70L, 80L, 90L}};

        // Demonstrate getTotal
        System.out.println("Total of intArray: " + TwoDArrayOperations.getTotal(intArray));
        System.out.println("Total of floatArray: " + TwoDArrayOperations.getTotal(floatArray));
        System.out.println("Total of doubleArray: " + TwoDArrayOperations.getTotal(doubleArray));
        System.out.println("Total of longArray: " + TwoDArrayOperations.getTotal(longArray));

        // Demonstrate getAverage
        System.out.println("Average of intArray: " + TwoDArrayOperations.getAverage(intArray));
        System.out.println("Average of floatArray: " + TwoDArrayOperations.getAverage(floatArray));
        System.out.println("Average of doubleArray: " + TwoDArrayOperations.getAverage(doubleArray));
        System.out.println("Average of longArray: " + TwoDArrayOperations.getAverage(longArray));

        // Demonstrate getRowTotal
        System.out.println("Total of row 1 in intArray: " + TwoDArrayOperations.getRowTotal(intArray, 1));

        // Demonstrate getColumnTotal
        System.out.println("Total of column 2 in floatArray: " + TwoDArrayOperations.getColumnTotal(floatArray, 2));

        // Demonstrate getHighestInRow
        System.out.println("Highest in row 0 of doubleArray: " + TwoDArrayOperations.getHighestInRow(doubleArray, 0));

        // Demonstrate getLowestInRow
        System.out.println("Lowest in row 2 of longArray: " + TwoDArrayOperations.getLowestInRow(longArray, 2));
    }
}
