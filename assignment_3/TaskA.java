// Minh Khoi Tran
// CS1400
// Assignment 3
// 09-26-2023

import java.util.Scanner;

public class TaskA {
    private static double commuter = 20582.0;
    private static double onCampus = 28108.0;
    private static double offCampus = 26584.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Costs of CPP Program");
        System.out.print("Please enter your room and board option (1 = commuter, 2 = on-campus housing and 3 = off-campus housing): ");
        int choice = Integer.parseInt(input.next());

        if (choice == 1) {
            String output = String.format("Your total estimated cost is $20,582 and your monthly cost is about $%.2f", commuter / 12);
            System.out.println(output);
        } 
        else if (choice == 2) {
            String output = String.format("Your total estimated cost is $28,108 and your monthly cost is about $%.2f", onCampus / 12);
            System.out.println(output);
        }
        else if (choice == 3) {
            String output = String.format("Your total estimated cost is $26,584 and your monthly cost is about $%.2f", offCampus / 12);
            System.out.println(output);
        }

        System.out.println("Thanks for using the program!");

        input.close();
    }
}