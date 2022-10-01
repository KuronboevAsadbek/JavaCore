package myExample;

import java.util.Objects;
import java.util.Scanner;

public class String47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String [] newText = text.split(" ");
//        for (int i = 0; i < newText.length; i++) {
        System.out.println(text.replaceAll("\\s+", " "));

    }
}
