package com.malhar_agency.services;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;

@Service
public class CloudinaryImageServiceImpl  implements CloudinaryImageService{

	@Autowired
	private Cloudinary cloudinary;
	
	
	@Override
	public Map upload(MultipartFile file) {
		// TODO Auto-generated method stub
		try {
			Map data =  cloudinary.uploader().upload(file.getBytes(), Map.of());
			return data;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw  new RuntimeException("Image upload failed ");
		}
		
	}
	

}
