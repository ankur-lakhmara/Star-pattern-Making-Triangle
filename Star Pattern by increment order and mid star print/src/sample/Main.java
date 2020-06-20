package sample;

import java.util.Scanner;
public class Main{
    public static void main(String[]arg){
        System.out.println("Enter Int Number"); // or you can say this program we try to make a triangle with stars
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");  //for print space (:
            }
            for(int J=1; J<=i; J++) //j is different from J because the j is end 1st braces and 2nd J is start from here ..
            {
                System.out.print("* ");  // for print stars(:
            }
            System.out.println();
        }
    }

}