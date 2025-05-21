package com.datastructure.datastructureDSA.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HighestOccurenceOfNum {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(2, 7, 9, 10, 66, 5, 2, 66, 7, 8, 66, 2, 2 );
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for(int num : list){
            map.put(num, map.containsKey(num) ? map.get(num)+1 :1 );
        }
       Map.Entry<Integer, Integer> mapEntry = map.entrySet()
               .stream()
               .max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println("max number of repeated number : "+ mapEntry.getKey() + " with number of repetive :" + mapEntry.getValue());

    }

}
