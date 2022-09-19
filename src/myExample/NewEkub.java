package myExample;

import java.util.Scanner;

public class NewEkub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Ekub(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));


    }

    public static int Ekub(int a, int b, int c) {
        int i = 1;
        int q = 0;
        while (a >= i) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                q = i;
            }
            i++;
        }
        return q;
    }
}
