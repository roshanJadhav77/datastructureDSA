package com.datastructure.datastructureDSA.interviewToday;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class HightestOccurance {
    public static void main(String[] args) {
        int[] array = {2,4,5,6,7,4,1,4,5,3,2,5,6,5,4,3,8,9,7,8,9};
        getHighestOccurance(array);
    }

    static void getHighestOccurance(int[] array){
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int ch : array){
            map.put(ch,map.containsKey(ch) ? map.get(ch) + 1 : 1);
        }

        System.out.println(map);

        int max=0, num=0;
        for(Map.Entry<Integer,Integer> value : map.entrySet()){
           if(max < value.getValue()){
               max = value.getValue();
               num = value.getKey();
           }
        }
        // System.out.println("Number "+num+" is the most Occurange "+max);

        //or

        Map.Entry<Integer, Integer> entry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Number " + entry.getKey() + " is the most Occurring " + entry.getValue());

    } // Number 4 is the most Occurange 4
}
