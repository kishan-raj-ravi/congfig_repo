package com.LAPP.entity;

import org.springframework.stereotype.Component;

@Component
public class LoanVariables {

	private Double loanAmountbelow4L;
	private Double loanAmountAbove10L;
	private Double LoanIntersetbelow4Mon;
	private Double LoanIntersetAbove8Mon;

	private Double loanRepaymentAmountMon;

	public LoanVariables() {

	}

	public LoanVariables(Double loanAmountbelow4L, Double loanAmountAbove10L, Double loanIntersetbelow4Mon,
			Double loanIntersetAbove8Mon, Double loanRepaymentAmountMon) {
		super();
		this.loanAmountbelow4L = loanAmountbelow4L;
		this.loanAmountAbove10L = loanAmountAbove10L;
		LoanIntersetbelow4Mon = loanIntersetbelow4Mon;
		LoanIntersetAbove8Mon = loanIntersetAbove8Mon;
		this.loanRepaymentAmountMon = loanRepaymentAmountMon;
	}

	public Double getLoanRepaymentAmountMon() {
		return loanRepaymentAmountMon;
	}

	public void setLoanRepaymentAmountMon(Double loanRepaymentAmountMon) {
		this.loanRepaymentAmountMon = loanRepaymentAmountMon;
	}

	public Double getLoanAmountbelow4L() {
		return loanAmountbelow4L;
	}

	public void setLoanAmountbelow4L(Double loanAmountbelow4L) {
		this.loanAmountbelow4L = loanAmountbelow4L;
	}

	public Double getLoanAmountAbove10L() {
		return loanAmountAbove10L;
	}

	public void setLoanAmountAbove10L(Double loanAmountAbove10L) {
		this.loanAmountAbove10L = loanAmountAbove10L;
	}

	public Double getLoanIntersetbelow4Mon() {
		return LoanIntersetbelow4Mon;
	}

	public void setLoanIntersetbelow4Mon(Double loanIntersetbelow4Mon) {
		LoanIntersetbelow4Mon = loanIntersetbelow4Mon;
	}

	public Double getLoanIntersetAbove8Mon() {
		return LoanIntersetAbove8Mon;
	}

	public void setLoanIntersetAbove8Mon(Double loanIntersetAbove8Mon) {
		LoanIntersetAbove8Mon = loanIntersetAbove8Mon;
	}

	@Override
	public String toString() {
		return "LoanVariables [loanAmountbelow4L=" + loanAmountbelow4L + ", loanAmountAbove10L=" + loanAmountAbove10L
				+ ", LoanIntersetbelow4Mon=" + LoanIntersetbelow4Mon + ", LoanIntersetAbove8Mon="
				+ LoanIntersetAbove8Mon + ", loanRepaymentAmountMon=" + loanRepaymentAmountMon + "]";
	}

}
