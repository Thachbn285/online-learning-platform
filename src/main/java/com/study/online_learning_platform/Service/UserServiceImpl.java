package com.study.online_learning_platform.Service;

import com.study.online_learning_platform.Model.UserModel;
import com.study.online_learning_platform.Entity.UserEntity;
import com.study.online_learning_platform.Repository.IUserRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepo userRepo;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<UserModel> getAllUsers() {
        List<UserEntity> userEntities = userRepo.findAll();
        return userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserModel.class))
                .toList();

    }

    @Override
    public UserModel getUserById(Long id) {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        // or throw an exception
        return userEntity.map(entity -> modelMapper.map(entity, UserModel.class)).orElse(null);

    }

    @Override
    public void createUser(UserModel user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userRepo.save(userEntity);
    }

    @Override
    public void updateUser(Long id, UserModel user) {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        userEntity.ifPresent(entity -> {
            entity.setFullName(user.getFullName());
            entity.setPassword(user.getPassword());
            entity.setEmail(user.getEmail());
            entity.setRole(user.getRole());
            entity.setPhoneNumber(user.getPhoneNumber());
            userRepo.save(entity);
        });
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

//    @Override
//    public String login(String username, String password) throws Exception {
//
//        UserEntity user = userRepo.findByUsername(username);
//
//        if (user == null) {
//            throw new Exception("User not found");
//        }
//        if (!passwordDecoder(user.getPassword()).equals(password)) {
//            throw new Exception("Invalid password");
//        }
//        return "Login successful for user: " + user.getFullName();
//    }
}
