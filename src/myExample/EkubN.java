package myExample;

import java.util.Scanner;

public class EkubN {
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        nEKUB(scanner.nextInt());

    }
    public static int nEKUB(int n){
        int i=1;
        int q=0;
        int a;
        while (true) {
        a=scanner.nextInt();
            if (a % i == 0) {
                q=i;
            }
            i++;
            return q;
        }
    }

}
