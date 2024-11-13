package com.malhar_agency.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


//needed to add more attributes of entity 


@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
//	@Column
//	private String userFullName;
//	
//	@Column
//	private String userEmail;
//	
//	@Column
//	private String userPassword;
//	@Column
//	private String userconfirmPassword;
//	@Column
//	private String role;
//	
	
	
	@Column private String userFirstName;
	@Column	private String   userLastName;
	@Column	private String   userEmail;
	@Column private String   userPassword;
	@Column private String   userConfirmPassword;
	@Column	private String   userMobileNo;
	@Column	private String  userCity;
	@Column	private String   userState;
	@Column	private String  userCountry;
	@Column private String role;
	
	public Users() {
		
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}

	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}

	public String getUserMobileNo() {
		return userMobileNo;
	}

	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

//	public String getUserFullName() {
//		return userFullName;
//	}
//
//
//
//	public void setUserFullName(String userFullName) {
//		this.userFullName = userFullName;
//	}
//
//
//
//	public Long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Long userId) {
//		this.userId = userId;
//	}
//
//	public String getUserEmail() {
//		return userEmail;
//	}
//
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//
//	public String getUserPassword() {
//		return userPassword;
//	}
//
//	public void setUserPassword(String userPassword) {
//		this.userPassword = userPassword;
//	}
//
//	public String getUserconfirmPassword() {
//		return userconfirmPassword;
//	}
//
//	public void setUserconfirmPassword(String userconfirmPassword) {
//		this.userconfirmPassword = userconfirmPassword;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}
//
//	@Override
//	public String toString() {
//		return "Users [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword
//				+ ", userconfirmPassword=" + userconfirmPassword + ", role=" + role + "]";
//	}
//	
	
	
	
	
}
