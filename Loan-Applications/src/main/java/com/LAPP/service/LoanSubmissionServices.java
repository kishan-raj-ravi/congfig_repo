package com.LAPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LAPP.Reso.UserResopistry;
import com.LAPP.entity.LoanEntity;
import com.LAPP.entity.LoanSubmissionDetails;
import com.LAPP.entity.LoanVariables;

@Service
public class LoanSubmissionServices {
	@Autowired
	LoanEntity loanEntity;
	@Autowired
	UserResopistry userResopistry;
	@Autowired
	LoanVariables loanVariables;

	public String submissionSerivce(LoanSubmissionDetails loanSubmissionDetails) {

		if (!loanSubmissionDetails.getUserLoanApplicationId()
				.equals(userResopistry.findById(loanSubmissionDetails.getUserLoanApplicationId()))) {
			return "Customer ID Is Not Found....";
		}

		if (loanSubmissionDetails.getUserLoanAnnualamount() >= 150000) {
			return "Your Annual Income is not Applicable. Minimum required is ₹1.5L.";
		}

		double userLoanAnnualIncome = loanSubmissionDetails.getUserLoanAnnualamount();
		double userLoanAmount = loanSubmissionDetails.getUserLoanAmount();
		int repaymentMonth = loanSubmissionDetails.getUserRepaymentMonth();

		if (repaymentMonth < 4 || repaymentMonth > 24) {
			return "Your Repayment Condition is Not Satisfied.";
		}

		double interestRate;

		if (userLoanAmount >= 50000 && userLoanAmount < 500000) {
			loanVariables.setLoanIntersetbelow4Mon(10.25);
			loanVariables.setLoanIntersetAbove8Mon(12.25);
			interestRate = (repaymentMonth <= 8) ? loanVariables.getLoanIntersetbelow4Mon()
					: loanVariables.getLoanIntersetAbove8Mon();
		} else if (userLoanAmount >= 500000 && userLoanAmount < 1000000) {
			loanVariables.setLoanIntersetbelow4Mon(10.25);
			loanVariables.setLoanIntersetAbove8Mon(12.25);
			interestRate = (repaymentMonth <= 12) ? loanVariables.getLoanIntersetbelow4Mon()
					: loanVariables.getLoanIntersetbelow4Mon();
		} else if (userLoanAmount >= 1000000 && userLoanAmount <= 2500000) {
			loanVariables.setLoanIntersetbelow4Mon(10.25);
			loanVariables.setLoanIntersetAbove8Mon(12.25);
			interestRate = (repaymentMonth <= 12) ? loanVariables.getLoanIntersetbelow4Mon()
					: loanVariables.getLoanIntersetbelow4Mon();
		} else {
			return "Your Loan ₹ Amount is above the criteria.";
		}

		loanVariables.setLoanIntersetbelow4Mon(interestRate);

		double monthlyInterestRate = interestRate / (12 * 100); // convert annual to monthly decimal
		double emi = (userLoanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, repaymentMonth))
				/ (Math.pow(1 + monthlyInterestRate, repaymentMonth) - 1);

		loanVariables.setLoanRepaymentAmountMon(emi);

		return "index.jsp.page" + emi;
	}
}