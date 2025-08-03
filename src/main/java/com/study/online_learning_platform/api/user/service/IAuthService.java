package com.study.online_learning_platform.api.user.service;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.ultils.ResponseDTO;

public interface IAuthService {
    ResponseDTO login(String username, String password);
    ResponseDTO register(UserDTO userDTO);
}
