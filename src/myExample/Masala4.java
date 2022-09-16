package uz.myExample;

import java.util.Scanner;

public class Masala4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("n sonni kiring");
        int n = scanner.nextInt();
        int num = 0;
        int min = 0;
        int max = 0;
        int i = 0;
        while (n > i) {
            num = scanner.nextInt();
            if (max > num) {
                if (i == 0) {
                    max = num;
                }
            } else {
                max = num;
            }
            if(min > num){
                min = num;
            }else if (i == 0){
                min = num;
            }
            i++;
        }
        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
