package com.datastructure.datastructureDSA.practice;

import java.util.LinkedHashMap;

public class    MostRepetativeWords {
        public static void main(String[] args){
            String str = " rahul, Mohan, Rahul, sachin, karan, mohan";
            String [] word = str.toLowerCase().split("\\s*, \\s*");
            //String[] words = str.toLowerCase().split("\\W+");

            LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

            for(String ch : word){
                map.put(ch, map.containsKey(ch)? map.get(ch)+1: 1);
            }

            map.entrySet()
                    .stream()
                    .filter(e -> e.getValue()>=1)
                    .forEach(entry -> System.out.println("Repeated words : " + entry.getKey() + "value :" + entry.getValue()));
        }

}  // 530-888-186
