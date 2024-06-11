package com.datastructure.datastructureDSA.java.array;

public class LastestSmalest {
    public static void main(String[] args) {
        int[] a = {4,5,111,-33,-22,2,6,7,88,4};

        int largest =a[0];
        int smallest =a[0];

        for(int i=0; i <a.length; i++){
            if(largest < a[i])
                largest = a[i];

            if(smallest > a[i])
                smallest = a[i];
        }

        System.out.println("Largest element is : "+largest);
        System.out.println("smallest element is : "+smallest);
    }



}
