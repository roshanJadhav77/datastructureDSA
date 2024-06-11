package com.datastructure.datastructureDSA.java.exception;

public class ExceptionExample {
    public static void main(String[] args)  {

        ExceptionExample e = new ExceptionExample();
        e.getException();

    }

    public void getException() {

        try{
            throw new CustomException();
        } catch (CustomException e){
            e.printStackTrace();
            e.setErrorMessage(" Custom Exception is here  ");
            System.out.println(e.getErrorMessage());
        }
    }
}
