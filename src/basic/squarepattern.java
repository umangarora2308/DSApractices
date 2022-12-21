package basic;

import java.util.Scanner;

public class squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                if (i ==1 || i ==s || j==1 || j == s) {
                    System.out.print("* ");
                }
                    else {
                    System.out.print("  ");
                }
                }


                System.out.println();

        }
    }
}
