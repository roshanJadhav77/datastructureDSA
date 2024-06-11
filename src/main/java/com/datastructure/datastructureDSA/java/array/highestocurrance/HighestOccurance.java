package com.datastructure.datastructureDSA.java.array.highestocurrance;

public class HighestOccurance {
    public static void main(String[] args) {

        int[] array = {2,1,4,5,2,6,2,7,2};
        int length = array.length;
        System.out.println("Most occured numner: "+mostFrequentOccurance(array, length));
    }

    static int mostFrequentOccurance(int[] array, int len){
         int max_count = 0;
         int max_frequent = 0;

         for(int i = 0; i < len; i ++){
            int count =  0;
            for(int j = 0; j < len; j++){
                if(array[i] == array[j]){
                    count++;
                }
            }

            if(count > max_count){
                max_count = count;
                max_frequent = array[i];
            }
         }

        return max_frequent;
    }
}
