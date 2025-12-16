package com.erp.controller.exception;

public class StoreMenuNotFoundException extends RuntimeException {
    public StoreMenuNotFoundException(String message) {
        super(message);
    }
}
