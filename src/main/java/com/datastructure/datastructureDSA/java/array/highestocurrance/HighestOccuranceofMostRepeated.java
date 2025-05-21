package com.datastructure.datastructureDSA.java.array.highestocurrance;

import java.util.*;

public class HighestOccuranceofMostRepeated {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 8, 3, 2, 7, 6, 2, 7, 7, 7, 2);
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int ch : list){
           map.put(ch, map.containsKey(ch) ? map.get(ch) +1: 1) ;
        }

        Integer val = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry ::getKey).orElse(null);
        System.out.println(val);

    }
}
