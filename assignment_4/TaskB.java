// Minh Khoi Tran
// CS 1400
// Assignment 4
// 10-10-2023

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your file name? ");
        String fileName = input.next();

        File yourFile = new File(fileName);
        try {
            Scanner reader = new Scanner(yourFile);
            int i = 1;

            while (reader.hasNextLine()) {
                System.out.println("Line " + i + ": " + reader.nextLine());
                i++;
            }
            reader.close();
        }
        catch (FileNotFoundException fe) {
            System.out.println("Uh oh! This file is not found!");
            input.close();
            return;
        }

        input.close();
    }
}