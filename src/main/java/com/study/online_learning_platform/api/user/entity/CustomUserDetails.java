package com.study.online_learning_platform.api.user.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class CustomUserDetails implements UserDetails {
    private UserEntity userEntity;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + userEntity.getRole().toUpperCase()));
    }

    @Override
    public String getPassword() {
        return userEntity.getPassword_hash();
    }

    @Override
    public String getUsername() {
        return userEntity.getUsername();
    }

    public UserEntity getUserEntity(UserEntity userEntity) {
        return userEntity;
    }
}
