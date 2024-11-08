package com.malhar_agency.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;

@Configuration
public class ProjectConfig {

	@Bean
	public Cloudinary getCloudinary() {
		
		Map map = new HashMap<>();
		map.put("cloud_name", "damwjitpg");
		map.put("api_key", "465471444128989");
		map.put("api_secret","G0LM-u-3TkThtLlYF1A9qWtWNuk");
		map.put("secure",true );
		return new Cloudinary(map);
	}
}
