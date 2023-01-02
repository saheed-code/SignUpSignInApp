package com.cohort13.signUpSignInApp.services;

import com.cohort13.signUpSignInApp.dtos.requests.RegisterRequest;
import com.cohort13.signUpSignInApp.dtos.responses.RegisterResponse;
import com.cohort13.signUpSignInApp.exceptions.EmailAlreadyExistException;

public interface UserService {
    RegisterResponse createUser(RegisterRequest registerRequest) throws EmailAlreadyExistException;
}
