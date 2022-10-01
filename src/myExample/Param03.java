package myExample;

import java.util.Scanner;

public class Param03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] a =  new int[n][m];
        int sum = 0;
        int nul=0;
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
//                System.out.print(a[i][j] + " ");
            }
//            System.out.println();
        }
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (k == i){
                    sum = sum + a[j][i];
                }
            }
        }
        System.out.println(sum);
    }
}
