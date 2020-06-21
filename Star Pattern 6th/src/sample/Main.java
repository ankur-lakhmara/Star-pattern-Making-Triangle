package sample;
import java.util.Scanner; // in this program we will print star's in the different pattern see ...image for output
public class Main {
    public static void main(String[] arg) {
        System.out.println("Enter int type number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i+2; j++) {
                System.out.print("      ");
            }{
                for (int k = 1; k <= n-i; k++){
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}

