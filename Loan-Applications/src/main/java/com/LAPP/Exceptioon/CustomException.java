package com.LAPP.Exceptioon;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomException extends RuntimeException {
	public CustomException() {

	}

	public CustomException(String exceptionName) {
		super(exceptionName);
	}

}
