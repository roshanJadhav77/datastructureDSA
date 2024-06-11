package com.datastructure.datastructureDSA.java.exception;

public class CustomException extends Exception {

    public String errorMessage;

    // constructor to write customer messages
    public CustomException() {
    }

    // getter setter
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
