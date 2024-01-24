// Minh Khoi Tran
// CS 1400
// Assignment 5
// 11-07-2023
public class SudokuSquare {
    public static boolean check(double[][] square) {
        double expectedSum = 15.0; // The expected sum for rows, columns, and diagonals

        // Check the size of the square
        if (square.length != 3 || square[0].length != 3) {
            return false; // Not a 3x3 square
        }

        // Calculate the sums of rows, columns, and diagonals
        double[] rowSums = new double[3];
        double[] colSums = new double[3];
        double diagonalSum1 = 0.0;
        double diagonalSum2 = 0.0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                double value = square[i][j];

                // Check if the value is between 1.0 and 9.0
                if (value < 1.0 || value > 9.0) {
                    return false;
                }

                rowSums[i] += value;
                colSums[j] += value;

                if (i == j) {
                    diagonalSum1 += value;
                }

                if (i + j == 2) {
                    diagonalSum2 += value;
                }
            }
        }

        // Check if all sums are equal to the expected sum
        return Double.compare(rowSums[0], expectedSum) == 0 &&
               Double.compare(rowSums[1], expectedSum) == 0 &&
               Double.compare(rowSums[2], expectedSum) == 0 &&
               Double.compare(colSums[0], expectedSum) == 0 &&
               Double.compare(colSums[1], expectedSum) == 0 &&
               Double.compare(colSums[2], expectedSum) == 0 &&
               Double.compare(diagonalSum1, expectedSum) == 0 &&
               Double.compare(diagonalSum2, expectedSum) == 0;
    }
}
