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
	private long enquiryId;
	
	@Column
	private String enquiryEmailId;
	
	@Column
	private String enquiryMobNo;
	@Column
	private String enquiryMessage;
	@Column
	private LocalDateTime submittedTime;
	
	public Enquiry() {
		this.submittedTime = LocalDateTime.now();
	}

	public long getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(long enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquiryEmailId() {
		return enquiryEmailId;
	}

	public void setEnquiryEmailId(String enquiryEmailId) {
		this.enquiryEmailId = enquiryEmailId;
	}

	public String getEnquiryMobNo() {
		return enquiryMobNo;
	}

	public void setEnquiryMobNo(String enquiryMobNo) {
		this.enquiryMobNo = enquiryMobNo;
	}

	public String getEnquiryMessage() {
		return enquiryMessage;
	}

	public void setEnquiryMessage(String enquiryMessage) {
		this.enquiryMessage = enquiryMessage;
	}

	public LocalDateTime getSubmittedTime() {
		return submittedTime;
	}

	public void setSubmittedTime(LocalDateTime submittedTime) {
		this.submittedTime = submittedTime;
	}

	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", enquiryEmailId=" + enquiryEmailId + ", enquiryMobNo="
				+ enquiryMobNo + ", enquiryMessage=" + enquiryMessage + ", submittedTime=" + submittedTime + "]";
	}
	
	
	
}
