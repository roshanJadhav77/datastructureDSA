package com.datastructure.datastructureDSA.java.array;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionTwoArray {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 2, 4, 6};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> intersector = new ArrayList<>();

        // Add elements of array1 to the set
        for(int num :array1){
            set.add(num);
        }

        // Check elements of array2 against the set
        for(int num: array2){
            if(set.contains(num)){
                intersector.add(num);
                set.remove(num); //to avoid dublicate
            }
        }

        System.out.println("Intersection "+intersector);

    }
}
