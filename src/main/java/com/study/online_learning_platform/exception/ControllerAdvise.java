package com.study.online_learning_platform.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.study.online_learning_platform.ultils.ResponseDTO;

@ControllerAdvice()
public class ControllerAdvise extends ResponseEntityExceptionHandler {
    @ExceptionHandler(MyException.class)
    public ResponseEntity<Object> handleFieldRequiredException(MyException ex, WebRequest request) {
        ResponseDTO errorResponse = new ResponseDTO();
        errorResponse.setMessage(ex.getMessage());
        List<String> details = new ArrayList<>();
        details.add("MyException");
        errorResponse.setDetails(details);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<Object> handleArithmeticException(ArithmeticException ex, WebRequest request) {
        ResponseDTO errorResponse = new ResponseDTO();
        errorResponse.setMessage(ex.getMessage());
        List<String> details = new ArrayList<>();
        details.add("Error occurred while trying to divided by zero or perform an invalid arithmetic operation");
        errorResponse.setDetails(details);
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
