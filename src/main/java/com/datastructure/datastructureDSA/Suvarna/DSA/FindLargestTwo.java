package com.datastructure.datastructureDSA.Suvarna.DSA;

import java.util.Arrays;

public class FindLargestTwo {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 3, 2, 8};

        int[] result = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).limit(2).mapToInt(Integer :: intValue).toArray();

        System.out.println(result[0]);
    }
}
