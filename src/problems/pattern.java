package problems;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n+i-1; j++) {
                if (j <= 2*i-2) {
                    System.out.print(" ");
                }
                   else{
                    System.out.print("*");
                }

            }

            System.out.println();
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 2; j < 2*n; j++) {
                if (j <=2*(n-i)+1 || j > 2*n-i+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }

            System.out.println();
        }
    }
}
