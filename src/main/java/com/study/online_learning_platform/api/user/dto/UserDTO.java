package com.study.online_learning_platform.api.user.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class UserDTO {
    Integer user_id;
    String username;
    String email;
    String password;
    String firstName;
    String lastName;
    String phone;
    Date dateOfBirth;
    String avatarUrl;
    String bio;
    String role;
    String status;
    Integer emailVerified;
    Date createdAt;
    Date updatedAt;
    Date lastLogin;

}
