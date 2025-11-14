package LW_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year :");
        int year = scanner.nextInt();

        if(year %100 == 0 ){
            if(year%400==0){
                System.out.println("Leap year ");
            }
            else {
                System.out.println("Not leap year ");
            }
        } else if (year%4==0) {
            System.out.println("Leap year ");
        }
        else{
            System.out.println("Not leap year ");
        }
    }
}
