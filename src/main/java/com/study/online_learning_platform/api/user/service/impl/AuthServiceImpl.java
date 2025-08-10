package com.study.online_learning_platform.api.user.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nimbusds.jose.JOSEException;
import com.study.online_learning_platform.api.user.dto.UserRequestDTO;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import com.study.online_learning_platform.api.user.service.IAuthService;
import com.study.online_learning_platform.ultils.JwtTokenUtils;
import com.study.online_learning_platform.ultils.ResponseDTO;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthServiceImpl implements IAuthService {
    JwtTokenUtils jwtTokenUtils;
    @Autowired
    IUserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public ResponseDTO login(String username, String password) throws JOSEException {
        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();
        if (username == null || password == null) {
            responseDTO.setMessage("Username hoặc password không được để trống");
            details.add("Vui lòng nhập đầy đủ username và password");
            responseDTO.setDetails(details);
            return responseDTO;
        }
        UserEntity userEntity = userRepository.findByUsername(username);
        if (userEntity.getUsername().equals(username) && userEntity.getPassword_hash().equals(password)) {
            String token = jwtTokenUtils.generateJwtToken(username);
            String message = "Đăng nhập thành công";
            responseDTO.setMessage(message);
            details.add(token);
            responseDTO.setDetails(details);
            return responseDTO;
        } else {
            responseDTO.setMessage("Sai username hoặc password");
            String detail = "Vui lòng kiểm tra lại thông tin đăng nhập";
            details.add(detail);
            responseDTO.setDetails(details);
            return responseDTO;
        }
    }

    @Override
    public ResponseDTO register(UserRequestDTO userRequestDTO) {
        boolean isValid = isExistUser(userRequestDTO.getUsername());
        ResponseDTO responseDTO = new ResponseDTO();
        List<String> details = new ArrayList<>();
        if (isValid) {
            String message = "Username đã tồn tại";
            responseDTO.setMessage(message);
            String detail = "Vui lòng chọn username khác";
            details.add(detail);
            responseDTO.setDetails(details);
            return responseDTO;
        }
        UserEntity userEntity = modelMapper.map(userRequestDTO, UserEntity.class);
        userEntity.setPassword_hash(passwordEncoder.encode(userRequestDTO.getPassword()));
        userRepository.save(userEntity);
        String message = "Register successfully";
        responseDTO.setMessage(message);
        String detail = "Register successfully with username and password";
        details.add(detail);
        responseDTO.setDetails(details);
        return responseDTO;
    }

    @Override
    public boolean isValidToken(String token) throws ParseException, JOSEException {
        return jwtTokenUtils.isValidateToken(token);
    }

    public boolean isExistUser(String username) {
        if (username == null) {
            return false;
        }
        UserEntity userEntity = userRepository.findByUsername(username);
        return userEntity != null;
    }
}
