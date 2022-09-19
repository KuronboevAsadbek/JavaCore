package myExample;

import java.util.Scanner;

public class IsLeapYear {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i = 0;
        int q=0;
        int count=0;

        while (n > i) {
            i++;
            q+=Leap(count);
        }
        System.out.println(q);

    }

    public static int Leap(int count) {
        int a = scanner.nextInt();
        if (((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)) {
            count++;
        }
        return count;
    }

}