package com.study.online_learning_platform.Entity;

import com.study.online_learning_platform.Enum.DistrictEnum;
import com.study.online_learning_platform.Enum.RoleEnum;
import jakarta.persistence.*;

import java.util.Date;

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
    private Enum<RoleEnum> role;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "district")
    @OneToMany(mappedBy = "")
    private Enum<DistrictEnum> district;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Enum<RoleEnum> getRole() {
        return role;
    }

    public void setRole(Enum<RoleEnum> role) {
        this.role = role;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Enum<DistrictEnum> getDistrict() {
        return district;
    }

    public void setDistrict(Enum<DistrictEnum> district) {
        this.district = district;
    }
}

