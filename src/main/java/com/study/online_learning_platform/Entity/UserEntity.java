package com.study.online_learning_platform.Entity;

import com.study.online_learning_platform.Enum.District;
import com.study.online_learning_platform.Enum.Role;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "USER")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "role")
    private Enum<Role> role;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "district")
    @OneToOne(
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST, CascadeType.MERGE
            },
            orphanRemoval = true
    )
    private Enum<District> district;

    @Column(name = "phoneNumber")
    private String phoneNumber;
}

