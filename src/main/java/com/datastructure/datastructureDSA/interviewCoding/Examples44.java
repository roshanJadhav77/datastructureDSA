package com.datastructure.datastructureDSA.interviewCoding;


import java.util.LinkedHashMap;
import java.util.stream.Collectors;

//Hi, Roshan Welcome
// need to identify repeated charactor
public class Examples44 {

    public static void main(String[] args) {
        String str = "Hi, Roshan Welcome";

        LinkedHashMap<Character, Long> frequencies = str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));

        System.out.println(frequencies);
    }
}
