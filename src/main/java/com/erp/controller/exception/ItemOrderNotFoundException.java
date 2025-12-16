package com.erp.controller.exception;

public class ItemOrderNotFoundException extends RuntimeException {
    public ItemOrderNotFoundException(String message) {
        super(message);
    }
}
