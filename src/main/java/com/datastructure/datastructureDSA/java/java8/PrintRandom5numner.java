package com.datastructure.datastructureDSA.java.java8;

import java.util.Random;

public class PrintRandom5numner {
    public static void main(String[] args) {

        Random rand = new Random();
        rand.ints().limit(5).sorted().forEach(System.out::println);
    }
}
