package com.LAPP.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LAPP.entity.LoanSubmissionDetails;
import com.LAPP.service.LoanSubmissionServices;

@RestController
@RequestMapping("/api")
public class LoanSubmissionController {

	public LoanSubmissionController() {
	}

	@Autowired
	LoanSubmissionServices localLoanSubmissionSerivces;

	@PostMapping("/loansubmission")
	public ResponseEntity<?> loansubmissioncontroller(LoanSubmissionDetails loanSubmissionDetails) {
		String submissionSerivce = localLoanSubmissionSerivces.submissionSerivce(loanSubmissionDetails);
		return new ResponseEntity(submissionSerivce, HttpStatus.CREATED);
	}

}
