package com.LAPP.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class LoanEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer UserId;
	private String UserName;
	private String UserEmail;
	private Long UserLong;
	private String UserAddress;
	@Enumerated(EnumType.STRING)
	private Role UserRole;

	public LoanEntity() {

	}

	public LoanEntity(Integer userId, String userName, String userEmail, Long userLong, String userAddress,
			Role userRole) {

		UserId = userId;
		UserName = userName;
		UserEmail = userEmail;
		UserLong = userLong;
		UserAddress = userAddress;
		UserRole = userRole;
	}

	public Integer getUserId() {
		return UserId;
	}

	public void setUserId(Integer userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}

	public Long getUserLong() {
		return UserLong;
	}

	public void setUserLong(Long userLong) {
		UserLong = userLong;
	}

	public String getUserAddress() {
		return UserAddress;
	}

	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}

	public Role getUserRole() {
		return UserRole;
	}

	public void setUserRole(Role userRole) {
		UserRole = userRole;
	}

	@Override
	public String toString() {
		return "LoanEntity [UserId=" + UserId + ", UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserLong="
				+ UserLong + ", UserAddress=" + UserAddress + ", UserRole=" + UserRole + "]";
	}

}

enum Role {
	CUSTOMER, ADMIN, LOAN_OFFICER

}