// fibonacci number using recursion
package com.datastructure.datastructureDSA.Suvarna.DSA;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class FibonacciNum {
    public static void main(String[] args) {
        System.out.println(fib(5));

    }
    static int fib(int n) {
        if(n<2){
            return n;
        }
        return ((n-1) + (n-2));

    }

}
