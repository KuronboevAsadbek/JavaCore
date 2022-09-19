package myExample;

import java.util.Scanner;

public class KabisaYili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)){
            System.out.println(true);
        }else System.out.println(false);

    }
}
