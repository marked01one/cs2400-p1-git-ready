// Minh Khoi Tran
// CS 1400
// Assignment 5
// 11-07-2023
public class ArrayPractice {
    public static double getTotal(double[][] arr) {
        double total = 0;
        for (double[] row : arr) {
            for (double value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(double[][] arr) {
        double total = 0;

        for (double[] row : arr){
            for (double value : row) total += value;
        }

        double numElements = arr.length * arr[0].length;
        return total / numElements;
    }

    public static double getRowTotal(double[][] arr, int rowIndex) {
        double total = 0;
        if (rowIndex >= 0 && rowIndex < arr.length) {
            for (double value : arr[rowIndex]) {
                total += value;
            }
        }
        return total;
    }

    public static double getColumnTotal(double[][] arr, int columnIndex) {
        int total = 0;
        if (columnIndex >= 0 && columnIndex < arr[0].length) {
            for (double[] row : arr) {
                total += row[columnIndex];
            }
        }
        return total;
    }

    public static double getHighestInRow(double[][] arr, int rowIndex) {
        double highest = Integer.MIN_VALUE;
        if (rowIndex >= 0 && rowIndex < arr.length) {
            for (double value : arr[rowIndex]) {
                if (value > highest) {
                    highest = value;
                }
            }
        }
        return highest;
    }

    public static double getLowestInRow(double[][] arr, int rowIndex) {
        double lowest = Integer.MAX_VALUE;
        if (rowIndex >= 0 && rowIndex < arr.length) {
            for (double value : arr[rowIndex]) {
                if (value < lowest) {
                    lowest = value;
                }
            }
        }
        return lowest;
    }
}