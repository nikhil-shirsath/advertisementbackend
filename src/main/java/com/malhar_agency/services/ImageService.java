package com.malhar_agency.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malhar_agency.dao.IImageDao;
import com.malhar_agency.entities.Image;
@Service
public class ImageService   {

	@Autowired
	private IImageDao imageDao;
	public boolean save(Image image) {
		// TODO Auto-generated method stub
		
		Image img =  imageDao.save(image);
		if(img ==null) {
			return false;
		}
		return true;
	}

}
