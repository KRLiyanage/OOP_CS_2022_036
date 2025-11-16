package LW_04;

import java.util.Scanner;

public class Q_07 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        if (number < 0) {
            number = -number;
        }

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a number (negative to quit): ");
            num = scanner.nextInt();

            if (num >= 0) {
                int digits = countDigits(num);
                System.out.println("Number of digits: " + digits);
            }

        } while (num >= 0);

        System.out.println("Program ended.");
        scanner.close();
    }
}
