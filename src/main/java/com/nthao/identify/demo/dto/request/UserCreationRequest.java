package com.nthao.identify.demo.dto.request;


import com.nthao.identify.demo.exception.ErrorCode;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

public class UserCreationRequest {
    @Size (min = 3,message = "USERNAME_INVALID")

    private String username;
    @Size (min = 8,message = "PASSWORD_INVALID")

    private String password;
    private String firstname;
    private String lastname;

    private LocalDate dod;
}
