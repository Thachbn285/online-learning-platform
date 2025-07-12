package com.study.online_learning_platform.Service;

import com.study.online_learning_platform.DTO.UserDTO;
import com.study.online_learning_platform.Entity.UserEntity;
import com.study.online_learning_platform.Enum.RoleEnum;
import com.study.online_learning_platform.Repository.IUserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepo userRepo;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        List<UserEntity> userEntities = userRepo.findAll();
        List<UserDTO> userDTOs = userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDTO.class))
                .toList();
        return userDTOs;

    }

    @Override
    public UserDTO getUserById(Long id) {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        if (userEntity.isPresent()) {
            return modelMapper.map(userEntity.get(), UserDTO.class);
        } else {
            return null; // or throw an exception
        }

    }

    @Override
    public void createUser(UserDTO user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userRepo.save(userEntity);
    }

    @Override
    public void updateUser(Long id, UserDTO user) {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        userEntity.ifPresent(entity -> {
            entity.setFullName(user.getFullName());
            entity.setPassword(user.getPassword());
            entity.setEmail(user.getEmail());
            entity.setRole(RoleEnum.valueOf(user.getRole()));
            entity.setPhoneNumber(user.getPhoneNumber());
            userRepo.save(entity);
        });
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
