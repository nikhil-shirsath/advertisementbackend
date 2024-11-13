package com.malhar_agency.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malhar_agency.dao.InquiryDao;
import com.malhar_agency.entities.Enquiry;

@Service
public class InquiryService {
	
	@Autowired
	private InquiryDao idao;

//	public Enquiry addInquiry(Enquiry inquiry) {
//		// TODO Auto-generated method stub
//		Enquiry myInquiry = new Enquiry();
//		inq.setEnquiryEmailId(inquiry.getEnquiryEmailId());
//		inq.setEnquiryMobNo(inquiry.getEnquiryMobNo());
//		inq.setEnquiryMessage(inquiry.getEnquiryMessage());
//		inq.setSubmittedTime(LocalDateTime.now());
//		
//		return  idao.save(myInquiry);
//	}

	public Enquiry addInquiry( Enquiry formData) {
	    // Create a new Enquiry object
	    Enquiry myInquiry = new Enquiry();
	    
	    // Set the fields for the enquiry from the form data using getters and setters
	    myInquiry.setUserEmail(formData.getUserEmail());
	    myInquiry.setUserMobileNo(formData.getUserMobileNo());
	    myInquiry.setInquiryMessage(formData.getInquiryMessage());
	    myInquiry.setSubmittedTime(LocalDateTime.now());  // Set current time as submission time
	    
	    // Assuming the city, state, and country fields are also part of the Enquiry entity
	    myInquiry.setUserCity(formData.getUserCity());
	    myInquiry.setUserState(formData.getUserState());
	    myInquiry.setUserCountry(formData.getUserCountry());

	    // Set the user's first and last name from the form data
	    myInquiry.setUserFirstName(formData.getUserFirstName());
	    myInquiry.setUserLastName(formData.getUserLastName());
	    
	    // Save the enquiry to the database (using an IDAO or similar)
	    return idao.save(myInquiry);
	}


	
	public List<Enquiry> getAllInquiries() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}




}
