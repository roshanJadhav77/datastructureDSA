package com.datastructure.datastructureDSA.java.array;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {

        List<Integer> numner = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> collect = numner.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList());
        System.out.println(collect);
    }

    static boolean isPrime(int n) {
        if(n < 1)
            return false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
