package com.datastructure.datastructureDSA.interviewCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNullAndEmpty {
    public static void main(String[] args) {
        /*List<String> string = Arrays.asList("apple", "", null, "banana", " ", "cherry");
                        string.stream()
                                .filter(str -> str != null && !str.trim().isEmpty())
                                .toList()
                                .forEach(System.out::println);*/
        List<String> string = Arrays.asList("apple", "goat", "", null, "", "test");
        ArrayList<String> map = new ArrayList<>();
        for(String word : string){
            if(word != null && !word.trim().isEmpty()){
                map.add(word);
            }


        }
        System.out.println(map);

    }
}
