package com.study.online_learning_platform.api.user.service;

import com.study.online_learning_platform.api.user.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> findAll();
    UserDTO findById(Integer id);
    String save(UserDTO userDTO);
    String update(UserDTO userDTO);
    void deleteById(Integer id);
}
