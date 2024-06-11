package com.nthao.identify.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter

public enum ErrorCode {
    UNCATEGORIED(9999, "Uncategoried error!!!"),
    INVALID_KEY(9998, "Invalid message key"),
    USERNAME_INVALID(1003, "Username invalid!!!"),
    PASSWORD_INVALID(1004, "Password invalid!!!"),
    USER_EXISTED(1002, "User existed!!!");
    private int code;
    private String message;
}
