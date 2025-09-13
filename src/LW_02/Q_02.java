package LW_02;
import java.util.Scanner;

public class Q_02 {

    public static int countDigits(int n) {
        int count = 0;
        if (n == 0) return 1;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Program ended!");
                break;
            }

            System.out.println(num + " has " + countDigits(num) + " digits.");
        }

        sc.close();
    }
}

