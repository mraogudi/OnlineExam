package com.online.exam.onlineexam.exceptions;

public class UserAlreadyExist extends Exception{
    public UserAlreadyExist() {
        super();
    }
    public UserAlreadyExist(String errorMessage) {
        super(errorMessage);
    }

    public UserAlreadyExist(String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public UserAlreadyExist(Throwable throwable) {
        super(throwable);
    }
}
