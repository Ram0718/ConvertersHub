package com.example.UnitsConverter.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(InvalidException.class)
   public String handleExceptio(InvalidException ie) {
	   return ie.getMessage();
   }

}
