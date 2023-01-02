package com.cohort13.signUpSignInApp.controllers;

import com.cohort13.signUpSignInApp.dtos.requests.RegisterRequest;
import com.cohort13.signUpSignInApp.dtos.responses.RegisterResponse;
import com.cohort13.signUpSignInApp.exceptions.EmailAlreadyExistException;
import com.cohort13.signUpSignInApp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequiredArgsConstructor
@RequestMapping("user/")
public class UserController {

    private final UserService userService;

    @PostMapping("register/")
    public ResponseEntity<?> registerResponse (@RequestBody RegisterRequest registerRequest) throws EmailAlreadyExistException {
        try{
            RegisterResponse registerResponse = userService.createUser(registerRequest);
            return new ResponseEntity<>(registerResponse, HttpStatus.CREATED);
        }
        catch (EmailAlreadyExistException ex){
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

//    @GetMapping("login/")
//    public RegisterResponse login(@RequestBody RegisterRequest registerRequest) throws EmailAlreadyExistException {
//        return userService.createUser(registerRequest);
//    }


}
