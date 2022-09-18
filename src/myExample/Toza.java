package myExample;

import java.util.Scanner;

public class Toza {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sonni kiring");
        int n = scanner.nextInt();
        int num = 0;
        int max = 0;
        int q = 1;
        int i = 0;
        int m =0;

        while (n > i) {
            num = scanner.nextInt();
            if (max < num) {
                if (i == 0) {
                    max = num;
                }
                i++;
            } else {
                max = num;
                i++;
                q = i;
            }
        }
        System.out.println(max+ " "+q);
    }
}