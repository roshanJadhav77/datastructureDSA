package com.datastructure.datastructureDSA.interviewCoding;

// String = ""
// last non repeating

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExampleToday {
    public static void main(String[] args) {
        String str = "swiss";
        System.out.println(nonRepeatingChar(str));

    }


    private static Character nonRepeatingChar(String input){

        HashMap<Character, Long> collect = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        HashMap::new,
                        Collectors.counting()
                ));

       /* return  input.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> collect.get(ch) == 1)
                .findFirst()
                .orElseThrow(null);*/

        //System.out.println(collect);

       /* return IntStream.range(0, input.length())
                .boxed()
                .map(input::charAt)
                .filter(ch -> collect.get(ch) == 1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No Non-repeating charactor found"));
*/
        for(int i = 0; i <= input.length() ; i++){
            char  ch = input.charAt(i);
            if(collect.get(ch) == 1){
                return ch;
            }
        }

        throw new IllegalArgumentException();

    }
}
