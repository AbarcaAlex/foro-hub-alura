package com.alura.forohub.infra;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeErrores {

    @SuppressWarnings("rawtypes")
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity errorHandlerValidationException(Exception e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
