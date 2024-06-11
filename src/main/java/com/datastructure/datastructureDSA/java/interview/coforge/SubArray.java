package com.datastructure.datastructureDSA.java.interview.coforge;

//int[] arr = new int[] {1, 2, 3, 7, 5}
//sum = 12
public class SubArray {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 7, 5};
        int sum = 12;
        int n = arr.length;

       subArray(arr, n, sum);
    }

    static int subArray(int arr[], int n, int sum) {

        int currentSum, i, j;

        for( i = 0; i < n; i++) {
           currentSum = 0;

           for( j = i; j < n; j++) {
               currentSum += arr[j];
               if(currentSum == sum)
                   System.out.println("sum of array "+i+"and "+j);
                   return 1;
           }
        }
        return  0;
    }

}
