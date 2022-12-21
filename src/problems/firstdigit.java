package problems;

import java.util.Scanner;

public class firstdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans= number(n);
        System.out.println(ans);
    }
    public static int number(int n){
        int rem =1;

        while(n>0){
            rem = n%10;
            n=n/10;

        }
        return rem;
    }
}
