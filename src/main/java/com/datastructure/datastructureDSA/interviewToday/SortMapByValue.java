package com.datastructure.datastructureDSA.interviewToday;

import java.util.HashMap;
import java.util.Map;

public class SortMapByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("B", 3);
        map.put("A", 1);
        map.put("C", 2);
        map.put("C", 5);
        map.put("D", 2);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }
}
