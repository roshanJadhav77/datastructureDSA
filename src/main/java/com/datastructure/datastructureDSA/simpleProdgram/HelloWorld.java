/*package com.datastructure.datastructureDSA.simpleProdgram;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/

package com.datastructure.datastructureDSA.simpleProdgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args){
        List<String> list = Arrays.asList("banana", "apple", "mango", "apple", "apple");
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(lists -> lists, Collectors.counting()));

        Map.Entry<String, Long> finalVal =  collect.entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get();


        Map.Entry<String, Long> entry = collect.entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get();
        System.out.println(entry);

        System.out.println("keys :" + finalVal.getKey());
        System.out.println("vaules :" + finalVal.getValue());

    }
}
