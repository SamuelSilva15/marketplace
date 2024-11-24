package com.br.marketplace.infra.handler.category;

import com.br.marketplace.core.exception.category.CategoryNotFoundException;
import com.br.marketplace.core.exception.category.CategoryRegisteredException;
import com.br.marketplace.infra.handler.RestErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CategoryExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<RestErrorMessage> handleCategoryNotFoundException(CategoryNotFoundException ex) {
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(restErrorMessage);
    }

    @ExceptionHandler(CategoryRegisteredException.class)
    public ResponseEntity<RestErrorMessage> handleCategoryRegisteredException(CategoryRegisteredException ex) {
        RestErrorMessage restErrorMessage = new RestErrorMessage(HttpStatus.BAD_REQUEST, ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(restErrorMessage);
    }
}