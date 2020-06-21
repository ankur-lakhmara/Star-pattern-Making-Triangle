package sample;
import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        System.out.println("Enter a int number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}