package myExample;

import java.util.Scanner;
import java.util.regex.Pattern;

public class String50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String separator="\\";
        String [] str_arr= text.replaceAll(Pattern.quote(separator), "\\\\").split("\\\\");

        for (int i = 0; i <str_arr.length; i++) {
        }
        if (str_arr.length>2){
            System.out.println(str_arr[str_arr.length-2]);
        }
        else
            System.out.println("\\");
    }
}
