package array;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        maxim(a,n);
    }

    private static void maxim(int[] a, int n) {
        int max=Integer.MIN_VALUE;


        for (int i = 0; i < n; i++) {
            if (max<a[i]) {
                max=a[i];
            }

        }
        System.out.println(max);
    }
    }