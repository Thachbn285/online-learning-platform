package com.study.online_learning_platform.Repository;

import com.study.online_learning_platform.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IUserRepo extends JpaRepository<UserEntity,Long> {
    public List<UserEntity> findByIdIn(List<Long> id);


}
