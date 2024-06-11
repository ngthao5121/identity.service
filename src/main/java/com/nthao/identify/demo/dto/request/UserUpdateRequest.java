package com.nthao.identify.demo.dto.request;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class UserUpdateRequest {
    @Size (min = 8,message = "Password must be at least 8 characters.")
    private String password;
    private String firstname;
    private String lastname;
    private LocalDate dod;
}
