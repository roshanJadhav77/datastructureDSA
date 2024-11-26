package com.datastructure.datastructureDSA.java.array.highestocurrance;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountRepeatedWords {
    public static void main(String[] args) {
        String str = "Roshan, Ganesh, Roshan, Bangalore, karnataka";

        String[] words = str.toLowerCase().split("\\W+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String ch :words){
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }

        map.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(entry -> System.out.println("Repeated words "+entry.getKey()+ " and Count "+entry.getValue()));

    }
}
