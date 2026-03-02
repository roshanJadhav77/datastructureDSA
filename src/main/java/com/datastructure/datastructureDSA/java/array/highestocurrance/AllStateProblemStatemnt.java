package com.datastructure.datastructureDSA.java.array.highestocurrance;


import java.util.Stack;

// matching breachse
// input {{(([[]]))}}
// (())(){}{}}]]
public class AllStateProblemStatemnt {

    public static void main(String[] args) {
        String s1 ="{{(([[]]))}}";
        System.out.println(isMatchingBraces(s1));
    }

    public static boolean isMatchingBraces(String s){
        Stack<Character> stack = new Stack<>();

        for(char entry : s.toCharArray()){

            if(entry == '(' || entry == '{' || entry =='[' ){
                stack.push(entry);
            } else if ( entry == ')' || entry == '}' || entry ==']') {
                if(stack.isEmpty()) return  false;

                char top = stack.pop();

                if((entry ==')' && top !='(' ) ||
                    (entry == '}' && top !='{') ||
                    (entry ==']' && top !='[' )){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

