package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.List;

public class FindMinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Integer min = list.stream().min(Integer::compare).get();
        Integer max = list.stream().max(Integer::compare).get();

        System.out.println(min);
        System.out.println(max);
    }
}
