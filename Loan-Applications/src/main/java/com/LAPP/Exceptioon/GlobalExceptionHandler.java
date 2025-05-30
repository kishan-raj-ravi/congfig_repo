package com.LAPP.Exceptioon;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler()
	public ResponseEntity<String> exceptionhandler(CustomException e) {

		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_ACCEPTABLE);

	}

}
