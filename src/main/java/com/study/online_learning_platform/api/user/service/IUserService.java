package com.study.online_learning_platform.api.user.service;

import java.util.List;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.ultils.ResponseDTO;

public interface IUserService {
    List<UserDTO> findAll();

    UserDTO findById(Integer id);

    void create(UserDTO userDTO);

    void updateById(Integer id, UserDTO userDTO);

    void deleteById(Integer id);
}
 