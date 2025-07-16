package com.study.online_learning_platform.api.user.service;

import com.study.online_learning_platform.api.user.entity.UserEntity;

import java.util.List;

public interface UserService {

    public List<UserEntity> findAll();

}
