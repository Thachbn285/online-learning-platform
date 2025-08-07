package com.study.online_learning_platform.api.user;

import com.study.online_learning_platform.api.user.dto.UserRequestDTO;
import com.study.online_learning_platform.api.user.dto.UserResponseDTO;
//import com.study.online_learning_platform.api.user.entity.CustomUserDetails;
import com.study.online_learning_platform.api.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    public List<UserResponseDTO> findAllUser() {
        return userService.findAll();
    }

    @GetMapping("")
    public UserResponseDTO userDtoDetail(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @PutMapping("/update")
    public UserResponseDTO post(@RequestParam Integer id, @RequestBody UserRequestDTO userRequestDTO) {
        userService.updateById(id, userRequestDTO);
        return userService.findById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody UserRequestDTO userRequestDTO) {
        userService.create(userRequestDTO);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam Integer id) {
        userService.deleteById(id);
    }

}
