package com.online.exam.onlineexam.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(UserNotFoundException.class)
    public CommonError userNotFound(UserNotFoundException e, WebRequest webRequest) {
        CommonError commonError = new CommonError();
        commonError.setErrorMessage(e.getMessage());
        commonError.setStatusCode(HttpStatus.NOT_FOUND.value());
        commonError.setTime(LocalDateTime.now());
        commonError.setContextPath(webRequest.getContextPath());
        return commonError;
    }

    @ExceptionHandler(UserAlreadyExist.class)
    public CommonError userAlreadyFound(UserAlreadyExist e, WebRequest webRequest) {
        CommonError commonError = new CommonError();
        commonError.setErrorMessage(e.getMessage());
        commonError.setStatusCode(HttpStatus.OK.value());
        commonError.setTime(LocalDateTime.now());
        commonError.setContextPath(webRequest.getContextPath());
        return commonError;
    }
}
