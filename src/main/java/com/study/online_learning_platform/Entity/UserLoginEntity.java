package com.study.online_learning_platform.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserLoginEntity {
    private String username;
    private String password;
    private String role;
    // Additional fields can be added as needed
}
