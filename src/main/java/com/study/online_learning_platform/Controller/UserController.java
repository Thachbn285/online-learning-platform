package com.study.online_learning_platform.Controller;

import com.study.online_learning_platform.DTO.UserDTO;
import com.study.online_learning_platform.Entity.UserEntity;
import com.study.online_learning_platform.Service.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public void createUser(UserDTO user) {
        userService.createUser(user);
    }

    @PostMapping("/update/{id}")
    public void updateUser(@PathVariable Long id, UserDTO user) {
        userService.updateUser(id, user);
    }

    @PostMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
