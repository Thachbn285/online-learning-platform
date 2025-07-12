package com.study.online_learning_platform.Service;

import com.study.online_learning_platform.DTO.UserDTO;
import com.study.online_learning_platform.Entity.UserEntity;

import java.util.List;

public interface IUserService {
    List<UserDTO> getAllUsers();
    String getUserById(Long id);
    public UserEntity createUser(UserDTO userDTO);
}
