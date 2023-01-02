package com.cohort13.signUpSignInApp.services;

import com.cohort13.signUpSignInApp.data.model.User;
import com.cohort13.signUpSignInApp.data.repositories.UserRepository;
import com.cohort13.signUpSignInApp.dtos.requests.RegisterRequest;
import com.cohort13.signUpSignInApp.dtos.responses.RegisterResponse;
import com.cohort13.signUpSignInApp.exceptions.EmailAlreadyExistException;
import com.cohort13.signUpSignInApp.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    private final ModelMapper modelMapper = new ModelMapper();
    @Override
    public RegisterResponse createUser(RegisterRequest registerRequest) throws EmailAlreadyExistException {
        Optional<User> existingUser = userRepository.findByEmail(registerRequest.getEmail());
        if(existingUser.isPresent())throw new EmailAlreadyExistException("This email is already registered!");
        User user = modelMapper.mapUser(registerRequest);
        User savedUser = userRepository.save(user);

        return new RegisterResponse("Registration successful", savedUser.getEmail());

    }
}
