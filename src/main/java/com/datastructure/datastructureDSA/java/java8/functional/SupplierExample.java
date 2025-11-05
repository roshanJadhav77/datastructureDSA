package com.datastructure.datastructureDSA.java.java8.functional;

import io.micrometer.observation.Observation;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Supplier<T> – No input, returns output
        Supplier<String> transactionIdSupplier = () -> UUID.randomUUID().toString();
        System.out.println("Generated Transaction ID: " + transactionIdSupplier.get());
    }
}
