package com.datastructure.datastructureDSA.interviewToday;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayOfObject {
    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        Integer[] flatten = flatten(array);
        System.out.println(Arrays.toString(flatten));

    }

    private static Integer[] flatten(Object[] array) {
        return Stream.of(array)
                .flatMap(ArrayOfObject::flattenStream)
                .toArray(Integer[]::new);
    }

    private static Stream<Integer> flattenStream(Object element){
        if(element instanceof Integer){
            return Stream.of((Integer) element);
        } else if (element instanceof Object[]) {
            return  Stream.of((Object[]) element).flatMap(ArrayOfObject::flattenStream);
        }else {
            throw new IllegalArgumentException("Unsupported type: " + element.getClass());
        }

        // return Stream.empty();
    }
}
