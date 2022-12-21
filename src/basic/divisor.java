package basic;

import java.util.Scanner;

public class divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        divisorfind(n);
    }

    public static void divisorfind(int n) {
        for (int i = 1; i <=n ; i++) {
            if (n%i==0) {
                System.out.println(i);
            }

        }
    }
}