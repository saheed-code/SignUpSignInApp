package com.cohort13.signUpSignInApp.data.repositories;

import com.cohort13.signUpSignInApp.data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}
