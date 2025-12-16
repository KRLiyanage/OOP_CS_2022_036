package LW_04;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}
