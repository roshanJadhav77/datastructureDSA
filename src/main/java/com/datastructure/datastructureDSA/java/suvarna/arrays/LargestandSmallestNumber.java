package com.datastructure.datastructureDSA.java.suvarna.arrays;

public class LargestandSmallestNumber {
    public static void main(String[] args){
        int a[]={2,56,13,8,10,1};
        int count=0;
        for(int i=1; i<=a.length; i++){
            count++;
        }
        System.out.println("number of elements in an array is :" + count);
        int n= a.length;
        System.out.println("length of an array with inbuilt method length: "+n);

        int max=a[0];
        int min=a[0];
        for(int var:a){
           if(max< var) {
               max = var;
           }
           else if(min> var) {
               min=var;
           }
        }
        System.out.println("largest element ois :"+max);
        System.out.println("smallest element is :"+min);

        //need to implement
    }
}
