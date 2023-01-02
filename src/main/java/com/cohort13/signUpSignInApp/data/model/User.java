package com.cohort13.signUpSignInApp.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;

//@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Setter @Getter
public class User {
    @Id
    private String id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private String phoneNumber;
}
