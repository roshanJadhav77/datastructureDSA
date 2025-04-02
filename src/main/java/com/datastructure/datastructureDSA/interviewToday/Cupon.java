package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// * Input: [1, 2, 3, 4, 4, 5, 6, 7, 7, 5]
//* Output: {1=1, 3=1, 5=2, 7=2}
public class Cupon {
    public static void main(String[] args) {

        int[] inputs = {1, 2, 3, 4, 4, 5, 6, 7, 7, 5};

        Map<Integer, Long> collect = Arrays.stream(inputs)
                .filter(n -> n % 2 != 0) // odd number
                .boxed() //
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((key, value) -> System.out.println("numbers: "+key+" Frequency: "+value));

    }

}
