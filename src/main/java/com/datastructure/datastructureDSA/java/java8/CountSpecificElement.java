package com.datastructure.datastructureDSA.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountSpecificElement {
    public static void main(String[] args) {

        String[] arr = {"java", "code", "springboot", "microservices", "java"};
        List<String> strings = Arrays.asList(arr);
       // strings.stream().forEach(x -> System.out.println(x));

        // Count of specific element in arr
        long count = strings.stream().filter(x -> "java".equals(x)).count();
        System.out.println(count);
    }
}