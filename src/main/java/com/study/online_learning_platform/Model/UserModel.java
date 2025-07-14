package com.study.online_learning_platform.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Builder
public class UserModel {
    // Declare variables
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String role;
    private Boolean status;
    private Date createdAt;
    private String phoneNumber;
    private String address;

}
