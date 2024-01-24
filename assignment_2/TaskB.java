// Minh Khoi Tran
// CS1400
// Assignment 2
// 09-19-2023
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of people in the party: ");
        double people = Double.parseDouble(input.nextLine());

        System.out.print("Total bill BEFORE tax: ");
        double beforeTax = Double.parseDouble(input.nextLine());

        double afterTaxAndTip = beforeTax * 1.0725 * 1.20;
        double perPersonAfterTax = afterTaxAndTip / people;

        String outputString = String.format("\nEach person will need to pay: $%.2f", perPersonAfterTax);
        
        System.out.println(outputString);

        input.close();
    }
}