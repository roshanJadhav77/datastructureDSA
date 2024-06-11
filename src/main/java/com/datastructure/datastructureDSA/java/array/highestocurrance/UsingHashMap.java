package com.datastructure.datastructureDSA.java.array.highestocurrance;

import java.util.HashMap;
import java.util.Map;

public class UsingHashMap {
    public static void main(String[] args) {
        int[] arr = {8,5,2,1,6,1,8,7,6,6,2,8,8,5};
        int len = arr.length;
        mostOcurrance(arr, len);
    }
    static void mostOcurrance(int[] arr, int len) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int c : arr) {
            map.put(c, map.containsKey(c) ? map.get(c)+1 : 1);
        }

        System.out.println(map);
        //find max frequency
        int max_count = 0, numb = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(max_count < entry.getValue()){
                max_count = entry.getValue();
                numb = entry.getKey();
            }
        }
        System.out.println(numb+" has occured "+max_count+" times");
    }
}
