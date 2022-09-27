package myExample;

import java.util.Scanner;

public class EkubN {
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i = 0;
        int z = 0;
        int x = 0;
        while (n > i){
            int num = scanner.nextInt();
            if(x == 0){
                x = num;
            }
            int y = 1;
            while (num >= y){
                if(num % y == 0 && x % y == 0){
                    z = y;
                }
                y++;
            }
            x =z;
            i++;
        }
        System.out.println("EKUB : "+x);
    }

}
