package myExample;

import java.util.Scanner;

public class String49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String [] newText= text.split("/");

        for (int i = 0; i <=newText.length; i++) {
            if (newText.length>1) {
            }
        }
        System.out.println(newText[newText.length-1]);
        String newText2 = newText[newText.length-1];
        String[] textt = newText2.split("\\.");
        for (int i = 0; i <textt.length; i++) {
            if (textt.length>1){
            }
        }
        System.out.println(textt[textt.length-1]);
    }
}
