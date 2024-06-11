package com.datastructure.datastructureDSA.java.array;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPrime {
    public static void main(String[] args) {

        int p = 20;
        for(int i=0; i<=p; i++){
            if(primeNum(i)){
                System.out.print(i+" ");
            }
        }

    }

    static int isPrime(int n){
        for(int i=2; i< n; i++){
            if(n%i==0)
             return 0;
        }
        return 1;

    }

    static void primeFactor(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i) == 1){
                int p = n;
                while(p%i==0){
                    System.out.println(i+" ");
                    p /= i;
                }
            }
        }

    }

    static boolean primeNum(int n){
        if(n <=1){
            return false;
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;

    }
}
