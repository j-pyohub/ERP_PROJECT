package com.erp.controller.exception;

public class StoreItemLimitConflictException extends RuntimeException {

    public StoreItemLimitConflictException(String message) {
        super(message);
    }
}
