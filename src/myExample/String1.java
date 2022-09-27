package myExample;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matn kiriting : ");

        String text = scanner.nextLine();

        String[] newText = text.split(" ");
        if(newText.length-1 == 1){
            System.out.println("Bosh satr");
        }
        for (int i = 1; i < newText.length-1; i++) {
                System.out.print(newText[i]+" ");
            }



    }
}
