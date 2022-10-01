package myExample;

import java.util.Scanner;

public class Matrix51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int min =arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min>arr[i][j]){
                    min=i;
                }
            }
        }
        System.out.println(min);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(min-1 != j){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}