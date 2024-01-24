// Minh Khoi Tran
// CS1400
// Assignment 3
// 09-26-2023

import java.util.Scanner;

public class TaskB {
    private static double commuter = 20582.0;
    private static double onCampus = 28108.0;
    private static double offCampus = 26584.0;
    private static double workWeeksPerYear = 30;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Costs of CPP Program");
        System.out.println("Please enter the amount of family support: ");
        double familySupport = Double.parseDouble(input.next());

        System.out.println("Please enter the amount of financial aid/loan you are eligible for: ");
        double financialAid = Double.parseDouble(input.next());
        
        System.out.println("Please enter your room and board option (1 = commuter, 2 = on-campus housing and 3 = off-campus housing): ");
        int choice = Integer.parseInt(input.next());

        double totalCost = 0;

        if (choice == 1) {
            totalCost = commuter;
        }
        else if (choice == 2) {
            totalCost = onCampus;
        }
        else if (choice == 3) {
            totalCost = offCampus;
        }

        System.out.println("Please enter the hourly rate: ");
        double hourlyRate = Double.parseDouble(input.next());

        double hoursPerWeek = (totalCost - familySupport - financialAid) / (hourlyRate * workWeeksPerYear);

        String output = String.format(
            "You need to work %.2f hours per week based on the information entered.",
            hoursPerWeek
        );

        System.out.println(output);

        input.close();
    }
}