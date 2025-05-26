package com.LAPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LAPP.Exceptioon.CustomException;
import com.LAPP.Reso.UserResopistry;
import com.LAPP.entity.LoanEntity;

@Service
public class LoanSerivce {
	@Autowired
	UserResopistry resopistry;

	public String addDetailsUser(LoanEntity loanentity) {
		try {
			resopistry.save(loanentity);
			String register = "Register Successfully completed";

			return register;
		} catch (Exception e) {

			throw new CustomException("Given value is not supported");
		}
	}

}
