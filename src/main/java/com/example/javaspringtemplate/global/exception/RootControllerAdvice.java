package com.example.javaspringtemplate.global.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RootControllerAdvice {
    @ExceptionHandler({IllegalArgumentException.class})
    public String handleException(BusinessException e) {
        return e.getMessage();
    }
}
