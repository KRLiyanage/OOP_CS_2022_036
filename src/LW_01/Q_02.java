package LW_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Full Name:");
        String first = input.next();
        String middle = input.next();
        String last = input.next();

        System.out.println(last +", "+first+" "+middle.substring(0,1));
    }
}