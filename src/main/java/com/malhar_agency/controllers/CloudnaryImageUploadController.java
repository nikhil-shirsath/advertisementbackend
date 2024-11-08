package com.malhar_agency.controllers;

import java.util.Map;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.malhar_agency.dao.IImageDao;
import com.malhar_agency.entities.Image;
import com.malhar_agency.services.CloudinaryImageService;
import com.malhar_agency.services.ImageService;

@RestController
@RequestMapping("/cloudinary/upload")
public class CloudnaryImageUploadController {

	//along with user we can now save this image url and public key 
	
	@Autowired
	private CloudinaryImageService cloudinaryService;
	
	@Autowired
	private ImageService imageService;
	
	@PostMapping
	public ResponseEntity<Map> uploadImage(@RequestParam("image") MultipartFile file){
		Map data =  cloudinaryService.upload(file);
		
		String imageUrl = (String) data.get("url");
		
		Image image = new Image();
		image.setImageUrl(imageUrl);
		
		boolean isSaved = imageService.save(image);
		if(isSaved) {
			System.out.println("image saved success fully ");
			return ResponseEntity.ok(data);
		}
		
		System.out.println("Not saved in database");
		return ResponseEntity.ok(data);
		

	}
}
