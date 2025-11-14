package LW_04;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Your second Number :");
        int num2 = sc.nextInt();
        System.out.println("Enter Your Third Number :");
        int num3 = sc.nextInt();
        int min;
        if(num1 > num2){
            min=num2;
            if(num3>num2){
                min=num2;
            }
            else{
                min=num3;
            }
        } else {
            min=num1;
            if(num3>num1){
                min=num1;
            }
            else{
                min=num3;
            }

        }
        System.out.println("Smallest number is: "+min);
    }
}
