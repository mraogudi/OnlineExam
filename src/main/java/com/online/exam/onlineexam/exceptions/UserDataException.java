package com.online.exam.onlineexam.exceptions;

public class UserDataException extends Exception {
    public UserDataException() {
        super();
    }
    public UserDataException(String errorMessage) {
        super(errorMessage);
    }

    public UserDataException(String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
    }

    public UserDataException(Throwable throwable) {
        super(throwable);
    }
}
