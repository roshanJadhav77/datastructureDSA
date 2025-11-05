package com.datastructure.datastructureDSA.java.java8.functional;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        //Function<T, R> – Takes input, returns output
        Function<Double, Double> applyTax = amount -> amount * 1.18 ; //18% tax
        System.out.println("Total with tax: " + applyTax.apply(1000.00));
    }
}
