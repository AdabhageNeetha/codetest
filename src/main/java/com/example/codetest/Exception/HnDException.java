package com.example.codetest.Exception;

public class HnDException extends Exception {
    String message;
    public HnDException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }

}
