package myExample;

import java.util.Scanner;

public class String45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] newText = text.split(" ");
        int min = newText[0].length();
        int count = 0;
        for (int i = 0; i <newText.length; i++) {
            if(newText[i].length() < min){
                min = newText[i].length();
                count = i;
            }
        }
        System.out.println(newText[count]+" "+min);
    }
}
