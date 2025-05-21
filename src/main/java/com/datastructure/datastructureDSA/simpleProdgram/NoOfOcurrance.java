package com.datastructure.datastructureDSA.simpleProdgram;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NoOfOcurrance {
    public static void main(String[] args) {
        String str = "Rahul, mohan, rohan, rahul , rohan";

        Map<String, Long> wordCount = Stream.of(str.toLowerCase().split("\\s*, \\s*")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);

        wordCount.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry-> System.out.println(entry.getKey() + "->" +entry.getValue()));

//        String str = "Roshan, rohan, suvarna, Suvarna, rahul, rohan";
//        String[] words = str.toLowerCase().split("\\W+");
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
//
//        for(String ch : words) {
//            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
//        }
//
//            map.entrySet().stream().filter(e -> e.getValue() == 2)
//                    .forEach(entry -> System.out.println("repeated words "+ entry.getKey() + "count of" + entry.getValue()));


    }


}
