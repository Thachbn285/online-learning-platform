package com.study.online_learning_platform.api.user.service.impl;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import com.study.online_learning_platform.api.user.service.IAuthService;
import com.study.online_learning_platform.ultils.JwtTokenUtils;
import com.study.online_learning_platform.ultils.ResponseDTO;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)

public class AuthServiceImpl implements IAuthService {
    @Autowired
    JwtTokenUtils jwtTokenUtils;
    @Autowired
    IUserRepository userRepository;
    @Value("${lengthPasswordEncoder}")
    int length;
    PasswordEncoder passwordEncoder;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseDTO login(String username, String password) {
        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();

        if (username == null || password == null) {
            responseDTO.setMessage("Username or password null");
            String detail = "Pleased check your username and password";
            details.add(detail);
            responseDTO.setDetails(details);
            return responseDTO;
        }
        UserEntity userEntity = userRepository.findByUsername(username);
        if (userEntity.getUsername().equals(username) && userEntity.getPassword_hash().equals(password)) {
            String token = jwtTokenUtils.generateJwtToken(username);
            String message = "Login successfully";
            responseDTO.setMessage(message);
            details.add(token);
            responseDTO.setDetails(details);
            return responseDTO;
        }else {
            responseDTO.setMessage("Wrong username or password");
            String detail = "Wrong username or password, check your username or password";
            details.add(detail);
            responseDTO.setDetails(details);
            return responseDTO;
        }
    }

    @Override
    public ResponseDTO register(UserDTO userDTO) {
        boolean isValid = isExistUser(userDTO.getUsername(), userDTO.getPassword_hash());
        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();
        if (isValid) {
            String message = "Username already exists";
            responseDTO.setMessage(message);
            String detail = "Pleased check your username and password";
            details.add(detail);
        }
        UserEntity userEntity = modelMapper.map(userDTO,UserEntity.class);
        userEntity.setPassword_hash(passwordEncoder.encode(userDTO.getPassword_hash()));
        userRepository.save(userEntity);
        String message = "Register successfully";
        responseDTO.setMessage(message);
        String detail = "Register successfully with username and password";
        details.add(detail);
        responseDTO.setDetails(details);
        return responseDTO;
    }

    public boolean isExistUser(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        UserEntity userEntity = userRepository.findByUsername(username);
        return userEntity != null;
    }
}
