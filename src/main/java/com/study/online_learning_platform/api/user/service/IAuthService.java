package com.study.online_learning_platform.api.user.service;

import com.nimbusds.jose.JOSEException;
import com.study.online_learning_platform.api.user.dto.UserResponseDTO;
import com.study.online_learning_platform.ultils.ResponseDTO;

import java.text.ParseException;

public interface IAuthService {
    ResponseDTO login(String username, String password) throws JOSEException;

    ResponseDTO register(UserResponseDTO userResponseDTO, String password);

    boolean isValidToken(String token) throws ParseException, JOSEException;
}
