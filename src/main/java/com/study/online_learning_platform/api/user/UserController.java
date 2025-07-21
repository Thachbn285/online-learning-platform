package com.study.online_learning_platform.api.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.service.IUserService;
import com.study.online_learning_platform.ultils.ResponseDTO;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    public List<UserDTO> userDTOs() {
        return userService.findAll();
    }

    @GetMapping("/")
    public UserDTO userDTO(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @PutMapping("/update/")
    public ResponseDTO post(@RequestParam Integer id, @RequestBody UserDTO userDTO) {
        return userService.updateById(id, userDTO);
    }

    @PostMapping("/create")
    public ResponseDTO create(@RequestBody UserDTO userDTO) {
        return userService.create(userDTO);
    }

    @DeleteMapping("/delete/")
    public ResponseDTO deleteUser(@RequestParam Integer id) {
        return userService.deleteById(id);
    }

}
