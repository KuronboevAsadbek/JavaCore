package myExample;

import java.util.Scanner;

public class TUb {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        int a = 0;
        int count = 0;

        while (a < n) {
            int i = scanner.nextInt();
            if(i>1) {
                if (i == 2 || i == 3 || i == 5 || i == 7) {
                    count++;
                    System.out.println(true);

                } else if (i % 2 == 0) {
                    System.out.println(false);
                } else if (i % 3 == 0) {
                    System.out.println(false);
                } else if (i % 5 == 0) {
                    System.out.println(false);
                } else if (i % 7 == 0) {
                    System.out.println(false);
                } else {
                    System.out.println(true);
                    count++;
                }
            }else System.out.println("1 tub son emas   " + false);

            a++;
        }
        System.out.println(count);

    }

}
