package myExample;

import java.util.Scanner;

public class Param5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int [] b= new int[n];
        for (int i = 0; i <a.length; i++) {
            a[i]=scanner.nextInt();
        }
        for (int i =a.length-1; i>=0; i--) {
            System.out.println(a[i] + " ");

        }
    }
}
