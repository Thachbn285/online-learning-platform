package com.study.online_learning_platform.Controller;

import com.study.online_learning_platform.Model.UserModel;
import com.study.online_learning_platform.Entity.UserLoginEntity;
import com.study.online_learning_platform.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    public List<UserModel> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserModel getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public void createUser(UserModel user) {
        userService.createUser(user);
    }

    @PostMapping("/update/{id}")
    public void updateUser(@PathVariable Long id, UserModel user) {
        userService.updateUser(id, user);
    }

    @PostMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam UserLoginEntity userLoginEntity) {
        try {
            String token = userService.login(userLoginEntity.getUsername(), userLoginEntity.getPassword());
            return ResponseEntity.ok(token);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Login failed: " + e.getMessage());
        }
    }
}