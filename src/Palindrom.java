import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int a=0;
        int b = 0;
        int count =0;
        while (n < 3){
            a = scanner.nextInt();
            n++;
//            System.out.println(isPalindrom(a,count));
            b += isPalindrom(a,count);
        }

        System.out.println("palindrom : " +b);

    }

    public static int isPalindrom(int a, int count){
        int q;
        int pal=a;
        int r=0;
        while(a>0){
            q=a%10;
            r=(r*10)+q;
            a=a/10;

        }if (pal == r) {
            System.out.println(true);
            count++;
        }else {
            System.out.println(false);
        }
        return count;
    }
}
