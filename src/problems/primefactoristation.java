package problems;

import java.util.Scanner;

public class primefactoristation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeFactorization(n);

    }
    public static void printPrimeFactorization(int n){
        for(int i=2;i<n;i++){
            if(isprime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
        // code here
    }
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    }
