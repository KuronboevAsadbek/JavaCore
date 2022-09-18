package myExample;

import java.util.Scanner;

public class Masala7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int num =0;
        int max=0;
        int min = 0;


        while (n>i){
            num = scanner.nextInt();
            if (max>num){
                max = num;

            }else {
                min = num;

            }
            i++;
        }
        System.out.println(max +" ");
    }
}
