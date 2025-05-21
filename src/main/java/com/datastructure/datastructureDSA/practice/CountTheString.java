package com.datastructure.datastructureDSA.practice;

import java.util.Arrays;
import java.util.List;

public class CountTheString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Raam", "shyam", "Rahul", "Janavi", "Jai", "Raati");

       Long value = list.stream().filter(e -> e.startsWith("R")).count();
        System.out.println("words starting with R : " + value);
    }
}
