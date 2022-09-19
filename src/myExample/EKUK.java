package myExample;

import java.util.Scanner;

public class EKUK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i =0;
        int q;
        int w;
        if (a>b){
            q=w=a;
        }else {
            q=w=b;

        }while (a!=0){
            if (q%a==0 && q%b==0){
                i= q;
                break;
            }
            q+=w;
        }
        System.out.println(i);
    }

}
