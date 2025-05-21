package com.datastructure.datastructureDSA.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestofTwo {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(3, 2, 6, 8, 17, 5);
        List<Integer> top2 = list.stream()
                .sorted((a,b) -> b-a).limit(2).collect(Collectors.toList());
        System.out.println("firstnum is : " + top2 );
    }
}
