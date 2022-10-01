package myExample;

import java.util.Scanner;

public class Matrix01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;
        int sum = 1;
        int a[][]=new int[n][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum *= a[j][i];
            }
            System.out.println(sum);
            sum = 1;
        }
    }
}
