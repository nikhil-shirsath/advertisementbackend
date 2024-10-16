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

	public Enquiry addInquiry(Enquiry inquiry) {
		// TODO Auto-generated method stub
		Enquiry inq = new Enquiry();
		inq.setEnquiryEmailId(inquiry.getEnquiryEmailId());
		inq.setEnquiryMobNo(inquiry.getEnquiryMobNo());
		inq.setEnquiryMessage(inquiry.getEnquiryMessage());
		inq.setSubmittedTime(LocalDateTime.now());
		
		return  idao.save(inq);
	}

	public List<Enquiry> getAllInquiries() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

}
