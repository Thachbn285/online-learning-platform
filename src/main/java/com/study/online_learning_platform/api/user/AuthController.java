package com.study.online_learning_platform.api.user;

import com.study.online_learning_platform.api.user.dto.UserDTO;
import com.study.online_learning_platform.api.user.service.IAuthService;
import com.study.online_learning_platform.ultils.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public ResponseDTO login(@RequestParam String username, @RequestParam String password) {
        return authService.login(username, password);
    }

    @PostMapping("/register")
    public ResponseDTO register(@RequestBody  UserDTO userDTO) {
        return authService.register(userDTO);
    }
}
