package com.datastructure.datastructureDSA.interviewToday;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GLExample {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 10);
        map1.put(2, 20);
        map1.put(3, 30);

        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 30);
        map2.put(2, 20);
        map2.put(3, 40);
        map2.put(4, 20);


        map2.forEach((key, value) ->
                map1.merge(key, value,Integer::sum)
                );


        //or

        Map<Integer, Integer> collect = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum));

        System.out.println(collect);

    }
}
