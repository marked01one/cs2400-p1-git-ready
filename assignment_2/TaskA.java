// Minh Khoi Tran
// CS1400
// Assignment 2
// 09-19-2023
import java.util.Scanner;

public class TaskA {
    private static double butterGram = 125.0;
    private static double butterOunce = 4.0;

    private static double sugarGram = 55.0;
    private static double sugarOunce = 2.0;

    private static double flourGram = 180.0;
    private static double flourOunce = 6.0;

    private static double breadCount = 24.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many loaves of shortbread do you want to make: ");

        double amount = Double.parseDouble(input.nextLine());

        double amountRatio = amount / breadCount;

        double butterGramOut = butterGram * amountRatio;
        double butterOunceOut = butterOunce * amountRatio;

        double sugarGramOut = sugarGram * amountRatio;
        double sugarOunceOut = sugarOunce * amountRatio;

        double flourGramOut = flourGram * amountRatio;
        double flourOunceOut = flourOunce * amountRatio;

        String butterString = String.format(
            "Amount of butter needed: %.2f g/%.2f oz", 
            butterGramOut, butterOunceOut
        );

        String sugarString = String.format(
            "Amount of sugar needed: %.2f g/%.2f oz", 
            sugarGramOut, sugarOunceOut
        );

        String flourString = String.format(
            "Amount of plain flour needed: %.2f g/%.2f oz", 
            flourGramOut, flourOunceOut
        );

        System.out.println(butterString + "\n" + sugarString + "\n" + flourString);

        input.close();
    }
}