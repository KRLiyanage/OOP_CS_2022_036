package LW_04;

import java.util.Scanner;
import java.util.Random;

public class Q_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Generate random number between 1 and 100
        int secretNumber = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Loop until user guesses correctly
        while (true) {
            System.out.print("Enter your guess: ");

            // Check if input is an integer
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next(); // discard invalid input
                continue;
            }

            guess = sc.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Number must be between 1 and 100.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number 🎉");
                break; // exit loop
            }
        }

        sc.close();
    }
}

