package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattedMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

        list.stream().flatMap(List::stream)
                .toList()
                .forEach((entry -> System.out.print(entry+" ") ));
    } // 1 2 3 4 5
}
