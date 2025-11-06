package com.datastructure.datastructureDSA.interviewCoding.UserCredential;

public class Test {
    public static void main(String[] args) {
        char[] charArray = "RJtestPassword@123".toCharArray();
        UserCredential userCredential = new UserCredential(charArray);

        System.out.println("Password : "+userCredential);
    }
}
