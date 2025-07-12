package com.study.online_learning_platform.ControllerAdvise;

import com.study.online_learning_platform.DTO.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ControllerAdvise extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex, WebRequest request) {
        ErrorResponseDTO errorResponse = new ErrorResponseDTO();
        errorResponse.setMessage("Lỗi toán học: " + ex.getMessage());

        List<String> details = new ArrayList<>();
        details.add("Hãy check lại các phép toán của bạn.");

        errorResponse.setDetails(details);

        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
