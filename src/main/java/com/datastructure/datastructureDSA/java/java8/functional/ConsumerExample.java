package com.datastructure.datastructureDSA.java.java8.functional;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        //Consumer<T> – Takes input, returns nothing
        Consumer<String> printReceipt = receipt -> System.out.println("Receipt: " + receipt);
        printReceipt.accept("Order #1234, Paid $250 via Credit Card");

    }
}
