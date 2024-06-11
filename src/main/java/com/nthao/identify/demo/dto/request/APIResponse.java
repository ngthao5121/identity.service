package com.nthao.identify.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse <T> {
    private int code =1000;
    private String message;
    private T  result;


}
