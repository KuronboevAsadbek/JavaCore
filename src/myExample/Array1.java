package myExample;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        int x = 1;
        int y= 1;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i+=2) {
            if(y != arr.length) {
                newArr[y] = arr[n - x];
            }
            newArr[i] = arr[c];
            x++;
            y+=2;
            c+=1;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
