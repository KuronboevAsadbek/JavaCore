package myExample;

import java.util.Scanner;

public class Param4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        int [] max = new int[n];
        for (int i = 0; i<arr.length; i++) {
            arr[i]=scanner.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                arr[0]=arr[i];
            }
        }
        System.out.println(arr[0]);
    }
}
