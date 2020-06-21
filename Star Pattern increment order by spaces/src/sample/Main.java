package sample;

import java.util.Scanner;
public class Main{
    public static void main(String[]arg){
        System.out.println("Enter int type number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            for (int j = 1; j <= n - i ;j++) {
                System.out.print("*  ");
            }

        System.out.println();
    }
    }
}