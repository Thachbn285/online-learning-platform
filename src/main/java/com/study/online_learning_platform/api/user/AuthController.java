package com.study.online_learning_platform.api.user;

import com.nimbusds.jose.JOSEException;
import com.study.online_learning_platform.api.user.dto.UserResponseDTO;
import com.study.online_learning_platform.api.user.service.IAuthService;
import com.study.online_learning_platform.ultils.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class AuthController {
    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public ResponseDTO login(@RequestParam String username, @RequestParam String password) throws JOSEException {
        return authService.login(username, password);
    }

    @PostMapping("/register")
    public ResponseDTO register(@RequestBody UserResponseDTO userResponseDTO, @RequestParam String password) {
        return authService.register(userResponseDTO, password);
    }

    @PostMapping("/verifyToken")
    public boolean isValidToken(@RequestParam String token) throws ParseException, JOSEException {
        return authService.isValidToken(token);
    }

}
