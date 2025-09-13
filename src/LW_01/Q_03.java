package LW_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Centimeters:");
        int cen = input.nextInt();
        double Ainch = cen/ 2.54;
        int feet =(int)Ainch/12;
        double inch = Ainch%12;

        System.out.println("Feet :"+feet);
        System.out.println("Inches :"+inch);
    }
}