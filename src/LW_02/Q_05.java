package LW_02;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:-\"'()");


        StringBuilder cleaned = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            cleaned.append(tokenizer.nextToken().toLowerCase());
        }


        String str = cleaned.toString();

        boolean isPalindrome = true;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        sc.close();
    }
}
