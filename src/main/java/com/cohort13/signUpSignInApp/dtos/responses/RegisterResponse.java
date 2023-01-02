package com.cohort13.signUpSignInApp.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class RegisterResponse {
    private String message;
    private String email;
}
