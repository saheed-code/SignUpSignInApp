package com.cohort13.signUpSignInApp.utils;

import com.cohort13.signUpSignInApp.data.model.User;
import com.cohort13.signUpSignInApp.dtos.requests.RegisterRequest;

public class ModelMapper {
    public User mapUser(RegisterRequest registerRequest){
        User user = new User();
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setFirstName(registerRequest.getFirstName());
        user.setLastName(registerRequest.getLastName());
        user.setPhoneNumber(registerRequest.getPhoneNumber());

        return user;
    }
}
