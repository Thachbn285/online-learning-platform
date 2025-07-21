package com.study.online_learning_platform.api.user.service.impl;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.repository.IUserRepository;
import com.study.online_learning_platform.api.user.service.IUserService;
import com.study.online_learning_platform.ultils.ResponseDTO;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDTO> findAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDTO.class))
                .toList();
    }

    @Override
    public UserDTO findById(Integer id) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        return modelMapper.map(userEntity, UserDTO.class);
    }

    @Override
    public ResponseDTO create(UserDTO userDTO) {
        UserEntity userEntity = userRepository.findById(userDTO.getUser_id())
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + userDTO.getUser_id()));
        ResponseDTO responseDTO = new ResponseDTO();
        if (userEntity.getUser_id() == null) {
            userEntity = modelMapper.map(userDTO, UserEntity.class);
            userRepository.save(userEntity);
            return responseDTO;
        }
        return responseDTO;
    }

    @Override
    public ResponseDTO updateById(Integer id, UserDTO userDTO) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
        ResponseDTO responseDTO = new ResponseDTO();
        if (userEntity.getUser_id() == null) {
            return responseDTO;
        }
        UserEntity newUserEntity = modelMapper.map(userDTO, UserEntity.class);
        userRepository.save(newUserEntity);
        return responseDTO;
    }

    @Override
    public ResponseDTO deleteById(Integer id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        ResponseDTO responseDTO = new ResponseDTO();

        if (userEntity.isPresent()) {
            userRepository.deleteById(id);
            return responseDTO;
        } else {
            return responseDTO;
        }
    }

}
