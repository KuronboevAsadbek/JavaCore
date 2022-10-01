package myExample;

import java.util.Scanner;

public class Matrixnew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int min =arr[i][0];
            for (int j = 0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
                if(min <arr[i][j]){
                    count1 = i;
                    count = j;
                }
            }
            System.out.println();
        }
        System.out.println(count1+" "+count);
    }
}
