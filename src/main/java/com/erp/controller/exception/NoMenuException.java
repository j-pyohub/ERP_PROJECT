package com.erp.controller.exception;

public class NoMenuException extends NullPointerException {
    public NoMenuException(Long menuNo) {
        super("존재하지 않는 메뉴입니다. : " + menuNo);
    }
}
