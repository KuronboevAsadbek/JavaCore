package myExample;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max=0;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //---------------------------------------
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - 1 == arr[i - 1] || arr[i] - 2 == arr[i - 1]) {
                if (arr[i] - 1 == arr[i + 1] || arr[i] - 2 == arr[i + 1]) {
                    if(k < 1){
                        arr[0] = arr[i];
                        k++;
                    }
                    if(arr[0] > arr[i]){
                        max = arr[i];
                    }else {
                        max = arr[0];
                    }

                }
            }
        }
        System.out.println(max);
    }
}
