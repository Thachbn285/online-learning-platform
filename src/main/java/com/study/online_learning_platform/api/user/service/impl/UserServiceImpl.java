package com.study.online_learning_platform.api.user.service.impl;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import com.study.online_learning_platform.api.user.service.UserService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public List<UserDTO> findAll() {
        ModelMapper mapper = new ModelMapper();

        List<UserDTO> userDTOs = new ArrayList<>();
        List<UserEntity> userEntities = userRepository.findAll();

        for (UserEntity userEntity : userEntities) {
            UserDTO userDTO = mapper.map(userEntity, UserDTO.class);
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @Override
    public UserDTO findById(Integer id) {
        ModelMapper mapper = new ModelMapper();
        UserEntity userEntity = userRepository.findById(id).orElse(null);
        if (userEntity != null) {
            return mapper.map(userEntity, UserDTO.class);
        }
        return null;
    }

    @Override
    public String save(UserDTO userDTO) {
        ModelMapper mapper = new ModelMapper();
        UserEntity userEntity = mapper.map(userDTO, UserEntity.class);
        userRepository.save(userEntity);
        return "User saved successfully with ID: " + userDTO.getId();
    }

    @Override
    public String update(UserDTO userDTO) {
        ModelMapper mapper = new ModelMapper();
        Integer id = userDTO.getId();
        Optional<UserEntity> userEntity = userRepository.findById(id);
        if (userEntity.isEmpty()) {
            throw new RuntimeException("User not found with id: " + id);
        }
        UserEntity updatedUserEntity = mapper.map(userDTO, UserEntity.class);
        userRepository.save(updatedUserEntity);
        return "User updated successfully with ID: " + userDTO.getId();
    }

    @Override
    public void deleteById(Integer id) {

    }
}
