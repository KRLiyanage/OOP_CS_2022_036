package LW_04;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the sentence input
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Take the word to be replaced
        System.out.print("Enter the word to be replaced: ");
        String oldWord = sc.nextLine();

        // Take the replacement word
        System.out.print("Enter the replacement word: ");
        String newWord = sc.nextLine();

        // Replace all occurrences of oldWord with newWord
        String updatedSentence = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

        // Display the result
        System.out.println("Updated sentence: " + updatedSentence);

        sc.close();
    }
}

