package com.online.exam.onlineexam.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public UserNotFoundException(Throwable throwable) {
        super(throwable);
    }

    public UserNotFoundException(Throwable throwable, String errorMessage) {
        super(errorMessage, throwable);
    }
}
