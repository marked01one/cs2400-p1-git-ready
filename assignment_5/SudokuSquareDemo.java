// Minh Khoi Tran
// CS 1400
// Assignment 5
// 11-07-2023
public class SudokuSquareDemo {
    public static void main(String[] args) {
        double[][] magicSquare = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        double[][] nonMagicSquare = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        boolean isMagic1 = SudokuSquare.check(magicSquare);
        boolean isMagic2 = SudokuSquare.check(nonMagicSquare);

        System.out.println("Magic Square 1:\n");
        System.out.println("2 7 6\n9 5 1\n4 3 8\n");

        if (isMagic1) {
            System.out.println("--> It's a magic Sudoku Square!");
        } else {
            System.out.println("--> It's not a magic Sudoku Square.");
        }

        System.out.println("---------------------------\nMagic Square 2:\n");
        System.out.println("1 2 3\n4 5 6\n7 8 9\n");

        if (isMagic2) {
            System.out.println("--> It's a magic Sudoku Square!");
        } else {
            System.out.println("--> It's not a magic Sudoku Square.");
        }
    }
}