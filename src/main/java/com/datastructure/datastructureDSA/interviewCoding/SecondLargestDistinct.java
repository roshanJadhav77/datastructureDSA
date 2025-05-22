package com.datastructure.datastructureDSA.interviewCoding;

import java.util.*;

public class SecondLargestDistinct {
    public static void main(String[] args) {

        int[] input = {12, 834, 56, 56, 78, 90, 90};
        getSecondHighest(input);
        getSecondHighestIsingJava8(input);

    }


    private static void getSecondHighestIsingJava8(int[] input) {

        Integer value = Arrays.stream(input)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("Second Highest Integer: "+value);
    }

    private static void getSecondHighest(int[] input) {
        TreeSet<Integer> map = new TreeSet<>(Collections.reverseOrder());

        for (int num : input){
            map.add(num);
        }

        Integer value = map.stream().skip(1).findFirst().get();
        System.out.println("Second Highest Integer: "+value);

        //or use Iterator
        /*Iterator<Integer> iterator = map.iterator();
        iterator.next();
        System.out.println("Second Highest: "+ iterator.next());*/
    }
}
