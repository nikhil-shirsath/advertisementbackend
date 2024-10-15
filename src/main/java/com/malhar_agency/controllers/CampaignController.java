package com.malhar_agency.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malhar_agency.entities.Campaign;
import com.malhar_agency.services.CampaignService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/campaigns")
public class CampaignController {
	
	@Autowired
	private CampaignService cservice ;
	
	@GetMapping("/campaigns")
	public List<Campaign> getAllCampaigns(){
		return cservice.getAllCampaign();
	}
	

	@GetMapping("/campaign/{id}")
	public Campaign getCampaignById(@PathVariable long id) {
		
		return cservice.getCampaignById(id);
	}
	
	@PostMapping("/campaign/add")
	public Campaign addNewCampaign(@RequestBody Campaign campaign ) {
		//TODO: process POST request
		
		return cservice.addNewCampaign(campaign);
	}
	
	@PutMapping("/campaign/update/{id}")
	public Campaign updateCampaign(@PathVariable long id , @RequestBody Campaign campaign) {
		
		return cservice.updateCampaign(id,campaign);
	}
	
	@DeleteMapping("/campaign/delete/{id}")
	public Campaign deleteCampaign(@PathVariable long id) {
		
		return cservice.deleteCampaign(id);
	}
	
	
}
