// Minh Khoi Tran
// CS 1400
// Assignment 4
// 10-10-2023

import java.util.Random;

public class TaskD {
    public static void main(String[] args) {
        Random rand = new Random();

        int randInt = rand.nextInt(4);

        System.out.println("Your number: " + randInt);

        switch (randInt) {
            case 1: 
                System.out.println("You won!");
                break;
            case 2: 
                System.out.println("You were so close!");
                break;
            case 3: 
                System.out.println("You were so close!");
                break;
            default: 
                System.out.println("Time to train harder!");
        }
    }
}