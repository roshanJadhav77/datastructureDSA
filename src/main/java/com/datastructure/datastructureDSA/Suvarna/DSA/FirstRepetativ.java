package com.datastructure.datastructureDSA.Suvarna.DSA;

import java.util.*;

public class FirstRepetativ {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(2, 3, 2, 7, 5, 7, 2, 7, 4, 7, 3, 2, 7, 2);

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for( int ch : list){
           map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1 );

        }

        Integer value = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry :: getKey).orElse(null);


        System.out.println(value);

//        String str = "afsfdtf";
//
//        HashMap<Character, Integer> map = new HashMap<>();
//
//
//        for(Character ch : str.toCharArray()){
//            map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
//            if(map.get)
//        }
//        System.out.println(map);
//
//        System.out.println(result);
    }
}
