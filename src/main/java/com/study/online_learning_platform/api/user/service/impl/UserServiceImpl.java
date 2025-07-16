package com.study.online_learning_platform.api.user.service.impl;

import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import com.study.online_learning_platform.api.user.service.UserService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
