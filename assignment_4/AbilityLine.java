import java.util.Scanner;

public class AbilityLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int abilityPoints = 0;

        while ((abilityPoints < 1) || (abilityPoints > 20)) {

        System.out.println("Enter your ability point (between 1 and 20): ");

        abilityPoints = Integer.parseInt(input.nextLine());

        }

        System.out.print("Your ability: ");

        for (int i = 0; i < abilityPoints; i++) {

        System.out.print("-");

        }
        
        input.close();

    }

}