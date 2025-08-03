package com.study.online_learning_platform.api.user.repository;

import com.study.online_learning_platform.api.user.entity.CustomUserDetails;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
}
