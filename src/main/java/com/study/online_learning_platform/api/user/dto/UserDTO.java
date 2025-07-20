package com.study.online_learning_platform.api.user.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    private String first_name;
    private String last_name;
    private String password;
    private String email;
    private String role;
    private String phone;
    private String avatar;
    private Date createdAt;
    private Date updatedAt;
}
