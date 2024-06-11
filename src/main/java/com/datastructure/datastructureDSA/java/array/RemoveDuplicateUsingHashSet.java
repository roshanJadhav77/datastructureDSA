package com.datastructure.datastructureDSA.java.array;

import java.util.HashSet;

public class RemoveDuplicateUsingHashSet {
    public static void main(String[] args) {

        int[] a = {1,2,5,3,1,4,5,5};
        HashSet<Integer> hm = new HashSet();

        for(int i : a){
            hm.add(i);
        }

        for(int result : hm){
            System.out.print(result+" ");
        }
    }
}
