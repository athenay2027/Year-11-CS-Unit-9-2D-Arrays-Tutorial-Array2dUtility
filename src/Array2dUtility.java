
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    public static int sum(int[][] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    // 3. average
    public static double average(int[][] array) {
        int total = sum(array);
        int numberOfElements = array.length * array.length; // Assuming square array
        return (double) total / numberOfElements;
    }

    // 4. minimum
    public static int minimum(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    // 5. maximum
    public static int maximum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    public static int evenCountStandard(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    public static int evenCountEnhanced(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    public static boolean allPositive(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    public static int[] rowSums(int[][] array) {
        int[] sums = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            sums[i] = sum;
        }
        return sums;
    }

    // 10. colSums
    public static int[] colSums(int[][] array) {
        int[] sums = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }
            sums[j] = sum;
        }
        return sums;
    }
}
