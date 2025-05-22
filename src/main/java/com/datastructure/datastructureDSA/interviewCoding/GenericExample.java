package com.datastructure.datastructureDSA.interviewCoding;

import java.util.Arrays;

public class GenericExample {
    public static void main(String[] args) {

        System.out.println(adds(2,2));
        System.out.println(adds(2.5,2));
        System.out.println(adds(2.5,2.5));
        System.out.println();

       /* System.out.println(addition(10, 20,34));
        System.out.println(addition(10));
        System.out.println(addition(10, 20,12,13));
        System.out.println(addition(10, 20,34));
        System.out.println(addition(10.5, 20.3, 5.2));
        System.out.println(addition(5.2f, 2.8f, 1.5f));*/
        System.out.println(addition(10, 10.0, 20L,2.0f));
    }

    // Generic method to add two numbers of any numeric type
    public static <T extends  Number> double adds(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    @SafeVarargs
    public static <T extends  Number> double addition(T... numbers){
        double sum = 0;
        for(T num : numbers){
            sum += num.byteValue();
        }

        double sum1 = Arrays.stream(numbers)
                .mapToDouble(Number::doubleValue)
                .sum();

        return sum1;
    }
}
