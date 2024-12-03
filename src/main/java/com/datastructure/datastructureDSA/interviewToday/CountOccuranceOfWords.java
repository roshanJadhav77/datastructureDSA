package com.datastructure.datastructureDSA.interviewToday;

import java.util.LinkedHashMap;

public class CountOccuranceOfWords {
    public static void main(String[] args) {

        String str = "Roshan, Ganesh, Roshan, Bangalore, karnataka";

        String[] words = str.toLowerCase().toLowerCase().split("\\W+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();


        for(String ch : words){
          /* if(map.containsKey(ch)){
               map.put(ch, map.get(ch) + 1);
           } else{
               map.put(ch, 1);
           }*/

            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }

        map.entrySet().stream()
                .filter(e -> e.getValue() > 0)
                .forEach( entry -> System.out.println("Repeated words "+entry.getKey() + " count of "+entry.getValue()));

       /* for(Map.Entry<String, Integer>  entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Repeated words is "+entry.getKey()+" and Count "+entry.getValue());
            }
        }*/

    }
}
