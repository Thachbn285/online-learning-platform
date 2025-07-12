package com.study.online_learning_platform.Service;

import com.study.online_learning_platform.DTO.UserDTO;
import com.study.online_learning_platform.Entity.UserEntity;

import java.util.List;

public interface IUserService {
    public List<UserDTO> getAllUsers();

    public UserDTO getUserById(Long id);

    public void createUser(UserDTO user);

    public void deleteUser(Long id);

    public void updateUser(Long id, UserDTO user);
}
