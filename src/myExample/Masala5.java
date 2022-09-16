package uz.myExample;

import java.util.Scanner;

public class Masala5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 0;
    while (n>=m){
        n=n-m;
    i++;
    }
        System.out.println(n +" " + i );

    }
}
