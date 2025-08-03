package com.study.online_learning_platform.api.user;

import com.study.online_learning_platform.api.user.dto.UserDTO;
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
    public List<UserDTO> findAllUser() {
        return userService.findAll();
    }

    @GetMapping("")
    public UserDTO userDtoDetail(@RequestParam Integer id) {
        return userService.findById(id);
    }

    @PutMapping("/update")
    public UserDTO post(@RequestParam Integer id, @RequestBody UserDTO userDTO) {
        userService.updateById(id, userDTO);
        return userService.findById(id);
    }

    @PostMapping("/create")
    public void create(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam Integer id) {
        userService.deleteById(id);
    }

}
