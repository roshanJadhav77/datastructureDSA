package com.datastructure.datastructureDSA.java.strings;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       /* Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }*/

        System.out.println("Below are the prime numbers from 1 to 100:---");
        // to print 1 to 100
        int a=1, b=20;
        for (int i=a; i<=b; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

