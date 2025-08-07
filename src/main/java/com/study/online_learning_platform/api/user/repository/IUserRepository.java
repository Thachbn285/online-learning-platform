package com.study.online_learning_platform.api.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.User;

import com.study.online_learning_platform.api.user.entity.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
}
