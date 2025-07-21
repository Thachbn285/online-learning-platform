package com.study.online_learning_platform.api.user.service;

import java.util.List;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.ultils.ResponseDTO;

public interface IUserService {
    List<UserDTO> findAll();

    UserDTO findById(Integer id);

    ResponseDTO create(UserDTO userDTO);

    ResponseDTO updateById(Integer id, UserDTO userDTO);

    ResponseDTO deleteById(Integer id);
}
 