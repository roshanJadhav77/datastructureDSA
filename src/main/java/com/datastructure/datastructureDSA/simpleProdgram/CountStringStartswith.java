package com.datastructure.datastructureDSA.simpleProdgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountStringStartswith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("addfcg", "fdtyfd", "adatwd", "fvbjhe", "afghv");

            long count = names.stream().filter(a -> a.startsWith("a")).count();
        System.out.println(count);


    }
}
