package myExample;

import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2;
        int num;

        while (n>=i){
            num= scanner.nextInt();
            int j = 2;
            while (i>=j){
                while (num>j){
                    if (num%j==0){
                        return;
                    }else
                        j++;
                }
            }
            i++;
            System.out.println(num);
        }

    }
}
