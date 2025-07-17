package com.study.online_learning_platform.api.user;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<UserDTO> userDTOS() {
        return userService.findAll();
    }

    @GetMapping("/")
    public UserDTO userDTO(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @PostMapping("/update")
    public String saveUser(@RequestBody UserDTO userDTO) {
        return userService.update(userDTO);
    }

    @DeleteMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userService.deleteById(id);
        return "User deleted successfully with ID: " + id;
    }
}
