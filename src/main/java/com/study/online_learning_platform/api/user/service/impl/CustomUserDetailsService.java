package com.study.online_learning_platform.api.user.service.impl;

import com.study.online_learning_platform.api.user.entity.CustomUserDetails;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByUsername(username);
        return (UserDetails) new CustomUserDetails().getUserEntity(userEntity);
    }
}
