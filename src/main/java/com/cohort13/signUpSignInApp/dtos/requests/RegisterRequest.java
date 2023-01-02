package com.cohort13.signUpSignInApp.dtos.requests;

import lombok.Getter;

@Getter
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
}
