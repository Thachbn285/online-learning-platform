package com.study.online_learning_platform.api.user.dto;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Column;
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
    String password_hash;
    String first_name;
    String last_name;
    String phone;
    Date date_of_birth;
    String avatar_url;
    String bio;
    String role;
    String status;
    Boolean email_verified;
    Timestamp created_at;
    Timestamp updated_at;
    Timestamp last_login;
}
