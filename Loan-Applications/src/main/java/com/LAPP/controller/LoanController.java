package com.LAPP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LAPP.entity.LoanEntity;
import com.LAPP.service.LoanSerivce;

@RestController
public class LoanController {
	@Autowired
	LoanSerivce loanserivce;

	@PostMapping("/api/addDetail")
	public ResponseEntity<?> addDetails(LoanEntity loanentity) {
		String detailsUser = loanserivce.addDetailsUser(loanentity);
		return new ResponseEntity<>(detailsUser, HttpStatus.CREATED);
	}

}
