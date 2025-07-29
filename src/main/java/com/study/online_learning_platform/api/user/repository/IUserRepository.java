package com.study.online_learning_platform.api.user.repository;

import com.study.online_learning_platform.api.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
}
