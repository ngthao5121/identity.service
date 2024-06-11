package com.nthao.identify.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter

public class AppException extends  RuntimeException{
    public AppException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    private ErrorCode errorCode;

}
