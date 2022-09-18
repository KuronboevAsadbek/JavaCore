package myExample;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        int count = 0;
        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
