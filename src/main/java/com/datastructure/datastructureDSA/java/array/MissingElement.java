package com.datastructure.datastructureDSA.java.array;

public class MissingElement {
    public static void main(String[] args) {

        int[] a = {1,2,3,5};
        extracted(a);
        findMissingElement(a);
    }

    private static void extracted(int[] a) {
        int expected_no_element = a.length+1;
        int total_sum = expected_no_element*(expected_no_element+1)/2;

        int sum = 0;
        for(int i = 0; i< a.length; i++){
            sum += a[i];
        }

        int result = total_sum - sum;

        System.out.println("Missing element is: "+result);
    }

    private static void findMissingElement(int[] array){
        int expectedNumOfElem = array.length + 1;
        int sumOfElem = expectedNumOfElem * (expectedNumOfElem + 1) / 2;

        int sum = 0;
        for(int number : array){
            sum += number;
        }

        int result = sumOfElem - sum;
        System.out.println("Missing element is: "+result);

    }
}
