import java.util.Scanner;

public class Ekub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 1;
        int q = 0;
        if (a > b) {
            while (a > i) {
                if (a % i == 0 && b % i == 0) {
                   q=i;
                }
                i++;
            }
            System.out.println(q);
        } else {
            while (b > i) {
                if ((a % i == 0 && b % i == 0)) {
                    q=i;
                }
                i++;
            }
            System.out.println(q);
        }
    }
}