package com.erp.controller.exception;

public class StoreItemLimitConflictException extends RuntimeException {

    public StoreItemLimitConflictException() {
        super("본사에서 이미 하한선을 설정한 품목입니다. 직영점에서는 수정할 수 없습니다.");
    }
}
