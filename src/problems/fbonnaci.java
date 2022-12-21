package problems;

import java.util.Scanner;

public class fbonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = fabonciseries(n);
        System.out.println(ans);
    }
    public static int fabonciseries(int n){
        int a=11;
        int b=11;
        int c=1;


        for (int i = 3; i <=n/10; i++) {

           c =a+b;
            a=b;
            b=c;

        }
        return c;
    }
}
