package com.malhar_agency.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long iamgeId;
	@Column
	private String imageUrl;
	public Image() {
		super();
	}
	public long getIamgeId() {
		return iamgeId;
	}
	public void setIamgeId(long iamgeId) {
		this.iamgeId = iamgeId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
