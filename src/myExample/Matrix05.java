package myExample;

import java.util.Scanner;

public class Matrix05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k=0;
        int [][] a = new int[n][m];
        int max=1;
        int mm =1;
        int nn = 1;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
                if (max<a[0][j]){
                    max=a[0][j];
                } else if (mm<a[1][j]) {
                    mm=a[1][j];
                }else
                    nn=a[2][j];
            }
            System.out.println();
        }
        System.out.println(max);
        System.out.println(mm);
        System.out.println(nn);
    }
}
