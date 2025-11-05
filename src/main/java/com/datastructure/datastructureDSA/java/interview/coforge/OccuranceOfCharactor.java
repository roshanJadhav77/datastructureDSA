package com.datastructure.datastructureDSA.java.interview.coforge;

import java.util.HashMap;

public class OccuranceOfCharactor {
    public static void main(String[] args) {
        String name = "Kavita";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : name.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }

        hashMap.forEach((k,c) -> System.out.println(k+" : "+c));
    }
}
