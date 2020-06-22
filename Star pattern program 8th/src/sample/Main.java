package sample;
import java.util.Scanner;
public class Main
{
    public static void main(String[]arg)
    {
        System.out.println("Enter int number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.print("");

        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}






