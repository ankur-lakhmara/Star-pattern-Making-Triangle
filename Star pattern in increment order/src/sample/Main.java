package sample;
import java.util.Scanner;
public class Main{
    public static void main(String[]arg) {
        System.out.println("Enter a int number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

