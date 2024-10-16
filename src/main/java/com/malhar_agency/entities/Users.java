package com.malhar_agency.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column
	private String userFullName;
	
	@Column
	private String userEmail;
	
	@Column
	private String userPassword;
	@Column
	private String userconfirmPassword;
	@Column
	private String role;
	
	public Users() {
		
	}
	
	

	public String getUserFullName() {
		return userFullName;
	}



	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserconfirmPassword() {
		return userconfirmPassword;
	}

	public void setUserconfirmPassword(String userconfirmPassword) {
		this.userconfirmPassword = userconfirmPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userconfirmPassword=" + userconfirmPassword + ", role=" + role + "]";
	}
	
	
	
}
