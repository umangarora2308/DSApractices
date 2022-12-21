package array;

import java.util.Scanner;

public class oddorevncount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
            countOddEven(a,n);
        }
    }

    static void countOddEven(int a[], int n) {


        int oddcount = 0;
        int evencount = 0;
        // Your code here
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evencount++;

            } else {
                oddcount++;
            }
        }
        System.out.print(oddcount + " ");
        System.out.print(evencount);
    }
}