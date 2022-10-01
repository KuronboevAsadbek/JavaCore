package myExample;

import java.util.Scanner;

public class Array38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i != j){
                    if(arr[i] == arr[j]){
                      count++;
                    }
                }
            }
            for (int k = 0; k < i; k++) {
                if(arr[k] == arr[i]){
                    a++;
                }
            }

            if(a == 0) {
                System.out.println(arr[i] + " soni " + count + " ta");
            }
            count=1;
            a=0;
        }
    }
}
