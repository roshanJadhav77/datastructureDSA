package com.datastructure.datastructureDSA.java.array;
//Input - Ram have nice car
//out put - Ram evah nice rac
//ADO

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEvenWord {

    public static void main(String[] args) {
        String s1 = "Ram have nice car";

       // System.out.println(reverEvenWords(s1));
        System.out.println(reverseEvenWordPlaced(s1));

    }

    private static String reverEvenWords(String input){

        AtomicInteger index = new AtomicInteger(1);

       return Arrays.stream(input.split(" "))
                .map(obj -> {
                    int position = index.getAndIncrement();
                    return (position % 2 ==0)
                            ? new StringBuilder(obj).reverse().toString()
                            : obj;
                })
                .collect(Collectors.joining(" "));
    }

    private static String reverseEvenWordPlaced(String input){

        String[] words = input.split(" ");

        IntStream range = IntStream.range(0, words.length);

        return IntStream.range(0, words.length)
                .mapToObj(i -> (i + 1) % 2 == 0
                        ? new StringBuilder(words[i]).reverse().toString()
                        : words[i]
                )
                .collect(Collectors.joining(" "));
    }

}
