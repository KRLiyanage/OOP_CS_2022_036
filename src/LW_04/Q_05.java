package LW_04;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double[] Entree = {3.49,4.59,3.99,2.99};
       double[] SideDish = {0.79,0.69,1.09,0.59};
       double[] Drink = {1.99,1.90,2.49,0.99};

        System.out.println("       Entree            |    Side Dish            |     Drink");
        System.out.println("_________________________|_________________________|_____________________");
        System.out.println("1.Tofu Burger      $3.49 |1. Rice Cracker    $0.79 |1. Cafe Mocha    $1.99");
        System.out.println("2.Cajun Chicken    $4.59 |2. No-Salt Fries   $0.69 |2. Cafe Latte    $1.90");
        System.out.println("3.Buffalo Wings    $3.99 |3. Zucchini        $1.09 |3. Espresso      $2.49");
        System.out.println("4.Rainbow Fillet   $2.99 |4. Brown Rice      $0.59 |4. Oolong Tea    $0.99");

        System.out.println("Please select an Entree (1-4): ");
        int entreeChoice = scanner.nextInt() - 1;

        System.out.println("Please select Side Dish (1-4): ");
        int sidhChoice = scanner.nextInt() - 1;

        System.out.println("Please select an Drink (1-4): ");
        int drinkChoice = scanner.nextInt() - 1;

        double sum = Entree[entreeChoice] + SideDish[sidhChoice] + Drink[drinkChoice];

        System.out.printf("\nTotal: $%.2f%n", sum);
    }
}
