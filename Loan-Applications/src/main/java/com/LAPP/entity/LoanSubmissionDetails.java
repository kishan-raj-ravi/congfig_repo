package com.LAPP.entity;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class LoanSubmissionDetails {

	private String usersLoanName;
	private String userLoanAddress;
	private Long userLoanMoblie;
	private Double userLoanAmount;
	private Double userLoanAnnualamount;
	private Integer userLoanApplicationId;
	private Integer userRepaymentMonth;
	private byte[] userAdhaarProof;
	private byte[] userIncomeProof;

	public LoanSubmissionDetails(String usersLoanName, String userLoanAddress, Long userLoanMoblie,
			Double userLoanAmount, Double userLoanAnnualamount, Integer userLoanApplicationId,
			Integer userRepaymentMonth, byte[] userAdhaarProof, byte[] userIncomeProof) {

		this.usersLoanName = usersLoanName;
		this.userLoanAddress = userLoanAddress;
		this.userLoanMoblie = userLoanMoblie;
		this.userLoanAmount = userLoanAmount;
		this.userLoanAnnualamount = userLoanAnnualamount;
		this.userLoanApplicationId = userLoanApplicationId;
		this.userRepaymentMonth = userRepaymentMonth;
		this.userAdhaarProof = userAdhaarProof;
		this.userIncomeProof = userIncomeProof;
	}

	public LoanSubmissionDetails() {

	}

	@Override
	public String toString() {
		return "LoanSubmissionDetails [UsersLoanName=" + usersLoanName + ", UserLoanAddress=" + userLoanAddress
				+ ", UserLoanMoblie=" + userLoanMoblie + ", UserLoanAmount=" + userLoanAmount
				+ ", UserLoanAnnualamount=" + userLoanAnnualamount + ", userLoanApplicationId=" + userLoanApplicationId
				+ ", UserRepaymentMonth=" + userRepaymentMonth + ", UserAdhaarProof=" + Arrays.toString(userAdhaarProof)
				+ ", UserIncomeProof=" + Arrays.toString(userIncomeProof) + "]";
	}

	public String getUsersLoanName() {
		return usersLoanName;
	}

	public void setUsersLoanName(String usersLoanName) {
		usersLoanName = usersLoanName;
	}

	public String getUserLoanAddress() {
		return userLoanAddress;
	}

	public void setUserLoanAddress(String userLoanAddress) {
		userLoanAddress = userLoanAddress;
	}

	public Long getUserLoanMoblie() {
		return userLoanMoblie;
	}

	public void setUserLoanMoblie(Long userLoanMoblie) {
		userLoanMoblie = userLoanMoblie;
	}

	public Double getUserLoanAmount() {
		return userLoanAmount;
	}

	public void setUserLoanAmount(Double userLoanAmount) {
		userLoanAmount = userLoanAmount;
	}

	public Double getUserLoanAnnualamount() {
		return userLoanAnnualamount;
	}

	public void setUserLoanAnnualamount(Double userLoanAnnualamount) {
		userLoanAnnualamount = userLoanAnnualamount;
	}

	public Integer getUserLoanApplicationId() {
		return userLoanApplicationId;
	}

	public void setUserLoanApplicationId(Integer userLoanApplicationId) {
		this.userLoanApplicationId = userLoanApplicationId;
	}

	public Integer getUserRepaymentMonth() {
		return userRepaymentMonth;
	}

	public void setUserRepaymentMonth(Integer userRepaymentMonth) {
		userRepaymentMonth = userRepaymentMonth;
	}

	public byte[] getUserAdhaarProof() {
		return userAdhaarProof;
	}

	public void setUserAdhaarProof(byte[] userAdhaarProof) {
		userAdhaarProof = userAdhaarProof;
	}

	public byte[] getUserIncomeProof() {
		return userIncomeProof;
	}

	public void setUserIncomeProof(byte[] userIncomeProof) {
		userIncomeProof = userIncomeProof;
	}

}
