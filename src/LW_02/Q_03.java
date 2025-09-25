package LW_02;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Number of Rows:");
        int row = x.nextInt();

        for(int i=1;i<=row;i++)
        {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        x.close();;
    }
}
