package com.example.sunbaseAssignment.Exceptions;

public class CustomerAlreadyExits extends RuntimeException {

    public CustomerAlreadyExits(String message){
        super(message);
    }
}
