package com.datastructure.datastructureDSA.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CountWordFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Mango", " Banana", "Mango", "mango", "orange");
        Map<String, Long> map = list.stream().map(m -> m.toLowerCase()).collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        Map.Entry<String, Long> wordCount = map.entrySet().stream().filter(e -> e.getValue()>1).findFirst().get();

        System.out.println("max count is : "+ wordCount);
    }
}
