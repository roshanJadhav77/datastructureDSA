package com.datastructure.datastructureDSA.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] argv) {

        var list = List.of(100,200,300,300,400,500,500,600,600,700,800);

        var set = new LinkedHashSet<>(list);

        set.forEach(entry -> System.out.println("LinkedHashSet "+entry));

        List<Integer>list2 = new ArrayList<Integer>(set);

        System.out.println("List after removing duplicate elements:");
        for (Integer ob: list2)
            System.out.println(ob);

    }
}
