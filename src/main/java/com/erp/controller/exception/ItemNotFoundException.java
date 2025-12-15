package com.erp.controller.exception;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(Long itemNo) {
        super("재료 정보 찾기 실패: " + itemNo);
    }
}
