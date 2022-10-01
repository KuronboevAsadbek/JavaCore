package myExample;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class String46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] newText= text.split(" ");
        String[] newArr = new String[newText.length];
        for (int i = 0; i < newText.length; i++) {
            if(!Objects.equals(newText[i], " ")){
                newArr[i] = newArr[i].substring(0,1).toUpperCase(Locale.ROOT);
            }else {
                newArr[i] = " ";
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }





    }
}
