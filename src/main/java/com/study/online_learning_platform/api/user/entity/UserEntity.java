package com.study.online_learning_platform.api.user.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotBlank
    @JsonProperty("userId")
    private Integer userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "fullname", nullable = false)
    private String fullname;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "is_active")
    private String isActive;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "address")
    private String address;


}
