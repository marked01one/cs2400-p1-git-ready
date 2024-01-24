// Minh Khoi Tran
// CS 1400
// Assignment 4
// 10-10-2023

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ability 1 score: ");
        int ability1 = Integer.parseInt(input.next()) / 10;
        String lines1 = "";
        for (int i = 0; i < ability1; i++) lines1 += "-";
        
        System.out.print("Enter ability 2 score: ");
        int ability2 = Integer.parseInt(input.next()) / 10;
        String lines2 = "";
        for (int i = 0; i < ability2; i++) lines2 += "-";
        
        System.out.print("Enter ability 3 score: ");
        int ability3 = Integer.parseInt(input.next()) / 10;
        String lines3 = "";
        for (int i = 0; i < ability3; i++) lines3 += "-";
        
        System.out.print("Enter ability 4 score: ");
        int ability4 = Integer.parseInt(input.next()) / 10;
        String lines4 = "";
        for (int i = 0; i < ability4; i++) lines4 += "-";
        
        System.out.print("Enter ability 5 score: ");
        int ability5 = Integer.parseInt(input.next()) / 10;
        String lines5 = "";
        for (int i = 0; i < ability5; i++) lines5 += "-";

        System.out.println("\nAbility 1: " + lines1);
        System.out.println("Ability 2: " + lines2);
        System.out.println("Ability 3: " + lines3);
        System.out.println("Ability 4: " + lines4);
        System.out.println("Ability 5: " + lines5);

        input.close();
    }
}