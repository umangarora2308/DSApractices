package basic;

import java.util.Scanner;

public class tablediffernce {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n1= sc.nextInt();
            int n2 =sc.nextInt();
            differnce(n1,n2);
    }
    public static void differnce(int n1, int n2)
    {
        int table1 =0;
        int table2=0;
        for (int i = 1; i <=10; i++) {
            table1=n1*i;
            table2=n2*i;

            if (n1 > n2) {
                int result= table1-table2;
                System.out.print(" "+result);
            }
        }

    }
}
