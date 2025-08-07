package com.study.online_learning_platform.api.user.service.impl;

import java.util.List;
import java.util.StringJoiner;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.study.online_learning_platform.api.user.dto.UserRequestDTO;
import com.study.online_learning_platform.api.user.dto.UserResponseDTO;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import com.study.online_learning_platform.api.user.service.IUserService;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;
    @Value("${lengthPasswordEncoder}")
    int length;

    PasswordEncoder passwordEncoder;

    @Override
    public List<UserResponseDTO> findAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserResponseDTO.class))
                .toList();
    }

    @Override
    public UserResponseDTO findById(Integer id) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        return modelMapper.map(userEntity, UserResponseDTO.class);
    }

    @Override
    public void create(UserRequestDTO userResponseDTO) {
        UserEntity userEntity = modelMapper.map(userResponseDTO, UserEntity.class);
        userEntity.setUser_id(null);

        userEntity.setPassword_hash(passwordEncoder.encode(userResponseDTO.getPassword()));
        userRepository.save(userEntity);
    }

    @Override
    public void updateById(Integer id, UserRequestDTO userResponseDTO) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        if (userEntity.getUsername() == null) {
            return;
        }
        UserEntity newUserEntity = modelMapper.map(userResponseDTO, UserEntity.class);
        userRepository.save(newUserEntity);
    }

    @Override
    public void deleteById(Integer id) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        userRepository.delete(userEntity);
    }
}