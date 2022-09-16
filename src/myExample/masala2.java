package uz.myExample;

import java.util.Scanner;

public class masala2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = 0;
        int i = 0;
        int sum = 0;

        while (n!=0){
            while (n>i){
                sum +=i;
                i++;
            }
            n=n/10;
            q++;

        }
        System.out.println(q+"" + " " + sum);

//        while(n>i) {
//            q += i;
//            i++;
//        }
//
//
//        System.out.println(q);
    }

}
