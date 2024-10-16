package com.malhar_agency.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malhar_agency.entities.Enquiry;

@Repository
public interface InquiryDao extends JpaRepository<Enquiry, Long> {

}
