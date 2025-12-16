package com.erp.controller.exception;

public class StoreItemNotFoundException extends RuntimeException {

    public StoreItemNotFoundException(String message) {
        super(message);
    }
}
