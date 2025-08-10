package com.study.online_learning_platform.api.user;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.jose.JOSEException;
import com.study.online_learning_platform.api.user.dto.UserRequestDTO;
import com.study.online_learning_platform.api.user.service.IAuthService;
import com.study.online_learning_platform.ultils.ResponseDTO;

@RestController
public class AuthController {
    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public ResponseDTO login(@RequestParam String username, @RequestParam String password) throws JOSEException {
        return authService.login(username, password);
    }

    @PostMapping("/register")
    public ResponseDTO register(@RequestBody UserRequestDTO userResponseDTO) {
        return authService.register(userResponseDTO);
    }

    @PostMapping("/verifyToken")
    public boolean isValidToken(@RequestParam String token) throws ParseException, JOSEException {
        return authService.isValidToken(token);
    }

}
