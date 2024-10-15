package com.malhar_agency.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malhar_agency.dao.ICampaignDao;
import com.malhar_agency.entities.Campaign;

@Service
public class CampaignService {

	@Autowired
	private ICampaignDao cdao;
	public List<Campaign> getAllCampaign() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}
	public Campaign getCampaignById(long id) {
		// TODO Auto-generated method stub
		return cdao.findById(id).get();
		
	}
	public Campaign addNewCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		Campaign cmp = new Campaign();
		cmp.setCampaign_budget(campaign.getCampaign_budget());
		cmp.setCampaign_description(campaign.getCampaign_description());
		cmp.setCampaign_name(campaign.getCampaign_name());
		cmp.setCampaign_start_date(campaign.getCampaign_start_date());
		cmp.setCampaign_end_date(campaign.getCampaign_end_date());
		
		
		return cdao.save(cmp);
	}
	
	public Campaign updateCampaign(long id, Campaign campaign) {
		
		Campaign cm = getCampaignById(id);
		if(cm!=null) {
			Campaign cmp = new Campaign();
			cmp.setCampaign_id(id);
			cmp.setCampaign_budget(campaign.getCampaign_budget());
			cmp.setCampaign_description(campaign.getCampaign_description());
			cmp.setCampaign_name(campaign.getCampaign_name());
			cmp.setCampaign_start_date(campaign.getCampaign_start_date());
			cmp.setCampaign_end_date(campaign.getCampaign_end_date());
			
			
			return cdao.save(cmp);
		}
		return null;
	}
	public Campaign deleteCampaign(long id) {
		// TODO Auto-generated method stub
		
		Campaign cmp = getCampaignById(id);
		if(cmp!=null) {
			 cdao.deleteById(id);
			 return cmp;
		}
		
		return null;
	}

}
