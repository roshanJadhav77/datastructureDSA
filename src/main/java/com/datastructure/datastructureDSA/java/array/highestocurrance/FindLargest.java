package com.datastructure.datastructureDSA.java.array.highestocurrance;

import java.util.HashMap;
import java.util.Map;

public class FindLargest {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,1,4,2,4};
        System.out.println(findLargest(arr));

    }

    public static int findLargest(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int result = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getKey() == e.getValue()) {
                result = Math.max(result, e.getKey());
            }
        }

        System.out.println(map);
        return result;
    }

}
