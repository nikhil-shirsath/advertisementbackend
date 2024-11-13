package com.malhar_agency.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malhar_agency.entities.Campaign;
import com.malhar_agency.services.CampaignService;

import ch.qos.logback.classic.Logger;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/campaign")
@CrossOrigin(origins = "http://localhost:4200") 
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
	
	//FOR SORTING AND FILTERING OF CAMPAIGN 
	
	@GetMapping("/campaign/filter/name")
	public List<Campaign> filterByName(@RequestParam String name) {
		return cservice.filterByName(name);
	}
	
	@GetMapping("/campaign/filter/budget")
	public List<Campaign> filterByBudget(@RequestParam double minBudget , double maxBudget) {
		return cservice.filterByBudget(minBudget,maxBudget);
	}
	
	@GetMapping("/campaign/filter/date")
	public List<Campaign> filterByDate
	 (@RequestParam String start_date,
     @RequestParam String end_date
	) {
		System.out.println(start_date+" "+end_date);
		LocalDate startdate = LocalDate.parse(start_date.trim());
		LocalDate enddate = LocalDate.parse(end_date.trim());
		
		return cservice.filterByDate(startdate, enddate);
	}
	
	
	//for sorting api 
	//this api not worling properly
	
	@GetMapping("campaign/sort")
	public List<Campaign> sortCampaigns(@RequestParam String field , @RequestParam String direction) {
		
		Sort sort = direction.equalsIgnoreCase("asc") ?Sort.by(field).ascending() : Sort.by(field).descending();
		
		return cservice.sortCampaigns( sort);
	}
	
	
	
}
