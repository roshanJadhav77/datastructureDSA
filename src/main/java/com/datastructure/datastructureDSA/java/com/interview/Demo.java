package com.datastructure.datastructureDSA.java.com.interview;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        String input = "RACECARS";
        char[] ch = input.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char entry : ch){
            if(hashMap.containsKey(entry)) {
                hashMap.put(entry, hashMap.get(entry) + 1);
            }
            else{
                hashMap.put(entry, 1);
            }
        }

        System.out.println(hashMap);

        for(Map.Entry<Character, Integer> hEntry : hashMap.entrySet()){
            if(hEntry.getValue() > 1){
                System.out.println(hEntry.getKey() + " : "+hEntry.getValue());

            }
        }
    }

}
