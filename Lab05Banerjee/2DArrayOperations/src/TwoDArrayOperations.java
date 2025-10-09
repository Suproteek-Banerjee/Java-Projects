public class TwoDArrayOperations {

    // getTotal methods
    public static int getTotal(int[][] array) {
        int total = 0;
        for (int[] row : array) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    public static float getTotal(float[][] array) {
        float total = 0;
        for (float[] row : array) {
            for (float value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getTotal(double[][] array) {
        double total = 0;
        for (double[] row : array) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static long getTotal(long[][] array) {
        long total = 0;
        for (long[] row : array) {
            for (long value : row) {
                total += value;
            }
        }
        return total;
    }

    // getAverage methods
    public static double getAverage(int[][] array) {
        return (double) getTotal(array) / (array.length * array[0].length);
    }

    public static float getAverage(float[][] array) {
        return getTotal(array) / (array.length * array[0].length);
    }

    public static double getAverage(double[][] array) {
        return getTotal(array) / (array.length * array[0].length);
    }

    public static double getAverage(long[][] array) {
        return (double) getTotal(array) / (array.length * array[0].length);
    }

    // getRowTotal methods
    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int value : array[row]) {
            total += value;
        }
        return total;
    }

    public static float getRowTotal(float[][] array, int row) {
        float total = 0;
        for (float value : array[row]) {
            total += value;
        }
        return total;
    }

    public static double getRowTotal(double[][] array, int row) {
        double total = 0;
        for (double value : array[row]) {
            total += value;
        }
        return total;
    }

    public static long getRowTotal(long[][] array, int row) {
        long total = 0;
        for (long value : array[row]) {
            total += value;
        }
        return total;
    }

    // getColumnTotal methods
    public static int getColumnTotal(int[][] array, int col) {
        int total = 0;
        for (int[] row : array) {
            total += row[col];
        }
        return total;
    }

    public static float getColumnTotal(float[][] array, int col) {
        float total = 0;
        for (float[] row : array) {
            total += row[col];
        }
        return total;
    }

    public static double getColumnTotal(double[][] array, int col) {
        double total = 0;
        for (double[] row : array) {
            total += row[col];
        }
        return total;
    }

    public static long getColumnTotal(long[][] array, int col) {
        long total = 0;
        for (long[] row : array) {
            total += row[col];
        }
        return total;
    }

    // getHighestInRow methods
    public static int getHighestInRow(int[][] array, int row) {
        int highest = array[row][0];
        for (int value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static float getHighestInRow(float[][] array, int row) {
        float highest = array[row][0];
        for (float value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static double getHighestInRow(double[][] array, int row) {
        double highest = array[row][0];
        for (double value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static long getHighestInRow(long[][] array, int row) {
        long highest = array[row][0];
        for (long value : array[row]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    // getLowestInRow methods
    public static int getLowestInRow(int[][] array, int row) {
        int lowest = array[row][0];
        for (int value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static float getLowestInRow(float[][] array, int row) {
        float lowest = array[row][0];
        for (float value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static double getLowestInRow(double[][] array, int row) {
        double lowest = array[row][0];
        for (double value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static long getLowestInRow(long[][] array, int row) {
        long lowest = array[row][0];
        for (long value : array[row]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }
}
