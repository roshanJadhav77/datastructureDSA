package com.datastructure.datastructureDSA.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] argv) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(400);
        list1.add(500);
        list1.add(600);
        list1.add(600);
        list1.add(700);
        list1.add(400);
        list1.add(500);

        list1.stream().forEach(System.out::println);

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list1);
        List<Integer>list2 = new ArrayList<Integer>(set);

        System.out.println("List after removing duplicate elements:");
        for (Integer ob: list2)
            System.out.println(ob);

    }



}
