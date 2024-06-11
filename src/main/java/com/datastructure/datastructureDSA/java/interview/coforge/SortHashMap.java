package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class SortHashMap {
    public static void main(String[] args) {
        final Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("USA", 100);
        wordCounts.put("jobs", 200);
        wordCounts.put("software", 50);
        wordCounts.put("technology", 70);
        wordCounts.put("opportunity", 200);

        System.out.println("map before sorting: " + wordCounts);

        Map<String, Integer> sorted = wordCounts.entrySet()
                .stream()
                .sorted(comparingByValue())
                .collect( toMap(e -> e.getKey(),  e -> e.getValue(), (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println("map before sorting: " +sorted);
    }
}

