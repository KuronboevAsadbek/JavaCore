package myExample;

import java.util.Scanner;

public class DigitN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int a = k;
        int n= scanner.nextInt();
        int i=0;
        if (n>0) {
            while (a > 0 ) {
                a = a / 10;
                i++;
            }
            if (i >= n) {
                while (i > n) {
                    k = k / 10;
                    i--;
                }
                System.out.println(k % 10);
            } else {
                System.out.println(-1);
            }
        }else System.out.println("n son 0 dan kichik");

    }
}
