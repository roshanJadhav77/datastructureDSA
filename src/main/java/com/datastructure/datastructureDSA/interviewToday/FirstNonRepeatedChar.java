package com.datastructure.datastructureDSA.interviewToday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "swiss";

        char entry = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.
                        toMap(
                                c -> c,
                                c -> 1,
                                Integer::sum,
                                LinkedHashMap::new))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get().getKey();

        System.out.println(entry);

    }
}
