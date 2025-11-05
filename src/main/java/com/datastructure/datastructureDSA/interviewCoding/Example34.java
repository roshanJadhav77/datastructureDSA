package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//arraylsit decimals 1.2, 2.3,3.4,4.5
// lambda expression to fetch those which are greater thn 3
public class Example34 {

    public static void main(String[] args) {

        List<Double> list = Arrays.asList(1.2, 2.3, 3.4, 4.5);

        List<Double> collect = list.stream().filter(l -> l > 3)
                .collect(Collectors.toList());

        System.out.println(collect);

    }

}
