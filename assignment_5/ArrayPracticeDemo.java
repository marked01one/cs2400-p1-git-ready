// Minh Khoi Tran
// CS 1400
// Assignment 5
// 11-07-2023
public class ArrayPracticeDemo {
    public static void main(String[] args) {
        // Sample two-dimensional array
        double[][] sampleArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Demonstrate the methods from ArrayPractice
        System.out.println("Total: " + ArrayPractice.getTotal(sampleArray));
        System.out.println("Average: " + ArrayPractice.getAverage(sampleArray));
        System.out.println("Row Total (Row 1): " + ArrayPractice.getRowTotal(sampleArray, 1));
        System.out.println("Column Total (Column 2): " + ArrayPractice.getColumnTotal(sampleArray, 2));
        System.out.println("Highest in Row (Row 0): " + ArrayPractice.getHighestInRow(sampleArray, 0));
        System.out.println("Lowest in Row (Row 2): " + ArrayPractice.getLowestInRow(sampleArray, 2));
    }
}