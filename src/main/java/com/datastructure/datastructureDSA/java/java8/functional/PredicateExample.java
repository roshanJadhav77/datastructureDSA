package com.datastructure.datastructureDSA.java.java8.functional;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        //Predicate<T> – Takes input, returns boolean
        Predicate<Integer> isHighValuePayment = (amount)  -> amount > 1000;
        System.out.println(isHighValuePayment.test(1500));
        System.out.println(isHighValuePayment.test(500));
    }
}
