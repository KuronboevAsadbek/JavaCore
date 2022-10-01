package myExample;

import java.util.Scanner;

public class Matrix49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] arr = new int[m][n];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            int max =arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"  ");
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }

    }
}
