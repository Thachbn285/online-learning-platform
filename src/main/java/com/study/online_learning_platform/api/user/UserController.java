package com.study.online_learning_platform.api.user;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.entity.UserEntity;
import com.study.online_learning_platform.api.user.service.UserService;
import com.study.online_learning_platform.api.user.service.UserServiceImpl;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDTO> userDTOS() {
        List<UserEntity> userEntities = userService.findAll();
        ModelMapper modelMapper = new ModelMapper();
        return userEntities.stream()
                .map(userEntity -> modelMapper.map(userEntity, UserDTO.class))
                .toList();
    }
}
