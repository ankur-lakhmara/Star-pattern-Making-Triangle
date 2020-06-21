package sample;
import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        System.out.println("Enter Int number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) { //j<=i-1 because we need to print space in every line this is for 2spaces print together
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) { //n-i+1 bacause when we increment in spaces than also we need to decrement in *'s
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}