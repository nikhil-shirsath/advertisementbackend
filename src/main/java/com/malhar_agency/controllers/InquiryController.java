package com.malhar_agency.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malhar_agency.entities.Enquiry;
import com.malhar_agency.services.InquiryService;


@RestController
@RequestMapping("/enquiry")
public class InquiryController {

	@Autowired
	private InquiryService iservice;
	
	@PostMapping("/add/enquiry")
	public Enquiry addInquiry(@RequestBody Enquiry inquiry) {
		//TODO: process POST request
		
		return iservice.addInquiry(inquiry);
	}
	
	@GetMapping("/getall/enquiries")
	public List<Enquiry> getAllInquiries(){
		return iservice.getAllInquiries();
	}
}
