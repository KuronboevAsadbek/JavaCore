package myExample;

import java.util.Scanner;

public class Neww {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int count = 1;
        int a[][]= new int[m][n];
        for (int i = 0; i < a.length; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = count;
                    count++;
                }
            }else {
                for (int j = a[i].length-1; j >= 0; j--) {
                    a[i][j] = count;
                    count++;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+ "  ");
            }
            System.out.println();
        }
    }

}
