package LW_02;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int max=0;
        int secMax=0;
        int maxN=0;

        Scanner x = new Scanner(System.in);

        System.out.println("Enter 5 Values:");
        for (int i=0;i< arr.length;i++){
            arr[i]=x.nextInt();
        }
        for (int j=0;j<5;j++){
            if(max < arr[j]){
                max=arr[j];
                maxN=j;
            }
        }
        for (int k=0;k<5;k++){
            if(k!=maxN){
                if (secMax < arr[k]){
                    secMax=arr[k];
                }
            }
        }

        System.out.println("The Second-largest Element is "+secMax);
    }
}
