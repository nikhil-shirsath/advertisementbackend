package com.malhar_agency.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.malhar_agency.entities.Campaign;
@Repository
public interface ICampaignDao extends JpaRepository<Campaign, Long>{

}
