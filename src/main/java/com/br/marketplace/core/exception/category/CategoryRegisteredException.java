package com.br.marketplace.core.exception.category;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoryRegisteredException extends RuntimeException {

    public CategoryRegisteredException(String categoria) {
        super("Category already registered: " + categoria);
    }
}
