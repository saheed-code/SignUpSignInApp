package com.cohort13.signUpSignInApp.exceptions;

import com.cohort13.signUpSignInApp.SignUpSignInAppApplication;

public class EmailAlreadyExistException extends SignUpSignInException {
    public EmailAlreadyExistException(String message) {
        super(message);
    }
}
