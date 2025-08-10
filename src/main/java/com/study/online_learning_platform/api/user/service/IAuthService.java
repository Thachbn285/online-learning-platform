package com.study.online_learning_platform.api.user.service;

import java.text.ParseException;

import com.nimbusds.jose.JOSEException;
import com.study.online_learning_platform.api.user.dto.UserRequestDTO;
import com.study.online_learning_platform.ultils.ResponseDTO;

public interface IAuthService {
    ResponseDTO login(String username, String password) throws JOSEException;

    ResponseDTO register(UserRequestDTO userResponseDTO);

    boolean isValidToken(String token) throws ParseException, JOSEException;
}
