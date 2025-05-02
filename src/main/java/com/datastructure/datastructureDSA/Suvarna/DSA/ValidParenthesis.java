package com.datastructure.datastructureDSA.Suvarna.DSA;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "[]{()}";
        boolean result = isValid(str);

        System.out.println(result);
    }

    public static boolean isValid(String str){
      Stack<Character> stack = new Stack<>();
      for(char ch : str.toCharArray()){
          switch(ch){
              case '(' : stack.push(')'); break;
              case '{' : stack.push('}'); break;
              case '[' : stack.push(']'); break;
              default : if(stack.isEmpty() || stack.pop() != ch){
                  return false;
              }

          }
      }
      return stack.isEmpty();
    }
}
