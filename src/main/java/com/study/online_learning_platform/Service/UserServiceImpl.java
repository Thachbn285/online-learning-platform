package com.study.online_learning_platform.Service;

import com.study.online_learning_platform.DTO.UserDTO;
import com.study.online_learning_platform.Entity.UserEntity;
import com.study.online_learning_platform.Repository.IUserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserRepo userRepo;

    @Override
    public List<UserDTO> getAllUsers() {
        ModelMapper mapper =new ModelMapper();

        return null;
    }

    @Override
    public String getUserById(Long id) {
        return userRepo.findById(id).toString();
    }

    @Override
    public UserEntity createUser(UserDTO userDTO) {
        UserEntity entity=new UserEntity();
        entity.setFullName(userDTO.getFullname());
        entity.setPassword(userDTO.getPassword());
        return entity;
    }
}
