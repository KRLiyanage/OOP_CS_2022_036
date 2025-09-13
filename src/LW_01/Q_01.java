package LW_01;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an odd-length word:");
        String name = input.nextLine();
        System.out.println("The middle character: "+ name.substring(name.length()/2,name.length()/2+1));

    }
}