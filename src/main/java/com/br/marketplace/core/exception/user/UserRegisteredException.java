package com.br.marketplace.core.exception.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserRegisteredException extends RuntimeException {

    public UserRegisteredException(String user) {
        super("User already registered: " + user);
    }
}
