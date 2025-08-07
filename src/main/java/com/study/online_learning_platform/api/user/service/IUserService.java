package com.study.online_learning_platform.api.user.service;

import java.util.List;

import com.study.online_learning_platform.api.user.dto.UserRequestDTO;
import com.study.online_learning_platform.api.user.dto.UserResponseDTO;

public interface IUserService {
    List<UserResponseDTO> findAll();

    UserResponseDTO findById(Integer id);

    void create(UserRequestDTO userResponseDTO);

    void updateById(Integer id, UserRequestDTO userResponseDTO);

    void deleteById(Integer id);
}
