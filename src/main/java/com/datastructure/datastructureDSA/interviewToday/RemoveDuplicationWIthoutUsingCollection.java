package com.datastructure.datastructureDSA.interviewToday;


// i --> j --> element[i]: element[j] <-- for save
public class RemoveDuplicationWIthoutUsingCollection {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,6,7,7,8,};
        int dupilicate = removeDupilicate(input);
        for(int i = 0; i < dupilicate; i++){
            System.out.print(input[i]+" ");
        }

    }

    private static int removeDupilicate(int[] input) {

        int length = input.length;

        if( length == 0 || length == 1){
            return length;
        }

        for(int i= 0; i< length; i++){
            for(int j = i + 1; j < length; j++){
                if(input[i] == input[j]){ // checking for same elements
                    for(int k = j ; k < length - 1; k++){
                        input[k] = input[k + 1];
                    }
                    length--;
                    j --;
                }
            }
        }

        return length;
    }
}
