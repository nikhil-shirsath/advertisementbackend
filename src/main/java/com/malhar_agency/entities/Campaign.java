package com.malhar_agency.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="campaign")
public class Campaign {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long campaign_id;
	@Column
	private String campaign_name;
	@Column
	private String campaign_description;
	@Column
	private String campaign_start_date;
	@Column
	private String campaign_end_date;
	@Column
	private double campaign_budget;
	
	
	public Campaign() {
		
	}
	
	public Campaign(String campaign_name, String campaign_description, String campaign_start_date,
			String campaign_end_date, double campaign_budget) {
		super();
		this.campaign_name = campaign_name;
		this.campaign_description = campaign_description;
		this.campaign_start_date = campaign_start_date;
		this.campaign_end_date = campaign_end_date;
		this.campaign_budget = campaign_budget;
	}

	public long getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(long campaign_id) {
		this.campaign_id = campaign_id;
	}

	public String getCampaign_name() {
		return campaign_name;
	}

	public void setCampaign_name(String campaign_name) {
		this.campaign_name = campaign_name;
	}

	public String getCampaign_description() {
		return campaign_description;
	}

	public void setCampaign_description(String campaign_description) {
		this.campaign_description = campaign_description;
	}

	public String getCampaign_start_date() {
		return campaign_start_date;
	}

	public void setCampaign_start_date(String campaign_start_date) {
		this.campaign_start_date = campaign_start_date;
	}

	public String getCampaign_end_date() {
		return campaign_end_date;
	}

	public void setCampaign_end_date(String campaign_end_date) {
		this.campaign_end_date = campaign_end_date;
	}

	public double getCampaign_budget() {
		return campaign_budget;
	}

	public void setCampaign_budget(double campaign_budget) {
		this.campaign_budget = campaign_budget;
	}

	@Override
	public String toString() {
		return "Campaign [campaign_id=" + campaign_id + ", campaign_name=" + campaign_name + ", campaign_description="
				+ campaign_description + ", campaign_start_date=" + campaign_start_date + ", campaign_end_date="
				+ campaign_end_date + ", campaign_budget=" + campaign_budget + "]";
	}
	
	
	

}