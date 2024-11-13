package com.malhar_agency.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long inquiryId;
	
//	@Column
//	private String enquiryEmailId;
//	
//	@Column
//	private String enquiryMobNo;
//	@Column
//	private String enquiryMessage;
//	@Column
//	private LocalDateTime submittedTime;
	 
	
	
	@Column private String userFirstName;     
	@Column private String userLastName;  
	@Column private String userEmail ;
	@Column private String userMobileNo  ;
	@Column private String inquiryMessage ;
	@Column private String userCity ;
	@Column private String userState ;
	@Column private String userCountry ;
	@Column private LocalDateTime submittedTime ;
		
	
	
	public Enquiry() {
		this.submittedTime = LocalDateTime.now();
	}



	public long getInquiryId() {
		return inquiryId;
	}



	public void setInquiryId(long inquiryId) {
		this.inquiryId = inquiryId;
	}



	public String getUserFirstName() {
		return userFirstName;
	}



	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}



	public String getUserLastName() {
		return userLastName;
	}



	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}



	public String getUserMobileNo() {
		return userMobileNo;
	}



	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}



	public String getInquiryMessage() {
		return inquiryMessage;
	}



	public void setInquiryMessage(String inquiryMessage) {
		this.inquiryMessage = inquiryMessage;
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



	public LocalDateTime getSubmittedTime() {
		return submittedTime;
	}



	public void setSubmittedTime(LocalDateTime submittedTime) {
		this.submittedTime = submittedTime;
	}



	@Override
	public String toString() {
		return "Enquiry [inquiryId=" + inquiryId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmail=" + userEmail + ", userMobileNo=" + userMobileNo + ", inquiryMessage=" + inquiryMessage
				+ ", userCity=" + userCity + ", userState=" + userState + ", userCountry=" + userCountry
				+ ", submittedTime=" + submittedTime + "]";
	}
	
	
	
	
}
