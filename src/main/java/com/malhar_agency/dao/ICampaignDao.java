package com.malhar_agency.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.malhar_agency.entities.Campaign;
@Repository
public interface ICampaignDao extends JpaRepository<Campaign, Long>{

	 @Query("SELECT c FROM Campaign c WHERE c.campaign_name LIKE %:name%")
	List<Campaign> findByNameContaining(String name);

	 @Query("SELECT c FROM Campaign c WHERE c.campaign_budget >= :minBudget AND c.campaign_budget <= :maxBudget")
	 List<Campaign> findByBudget(@Param("minBudget") double minBudget, @Param("maxBudget") double maxBudget);

	 @Query("SELECT c FROM Campaign c WHERE c.campaign_start_date >= :startdate AND c.campaign_end_date <= :enddate")
	List<Campaign> filterByDate(LocalDate startdate, LocalDate enddate);

}
