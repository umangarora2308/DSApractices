package basic;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        lcmfind(a,b);
    }

    static void lcmfind(int a,int b){

        int x=Math.min(a,b);
        int y = a*b;
        int ans =x;
        for (int i = x; i <=y; i++) {
            if (i%a==0 && i%b==0) {
                ans=i;
                break;
            }

        }
        System.out.println(ans);

    }
}
