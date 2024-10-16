package com.malhar_agency.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.malhar_agency.entities.Users;
import com.malhar_agency.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService uservice;
	
	@PostMapping("/register/user")
	public ResponseEntity<String> addUser(@RequestBody Users user) {
		if(uservice.checkIfUserExists(user.getUserEmail())) {
			return ResponseEntity.badRequest().body("User is Already Present ");
		}
		 Users u = uservice.addUser(user);
		 if(u!=null) {
			 return ResponseEntity.status(201).body(u.toString());
		 }
		 return ResponseEntity.badRequest().body(" PassWord Not matched check again  ");
	}
	//make sepraton to get only the customers.
	//need to make changes to get only the cutomers not admins 
	@GetMapping("/getall/users")
	public List<Users> getAllUsers() {
		return uservice.getAllUsers();
	}
	
	@PostMapping("/register/admin")
	public ResponseEntity<String> addAdmin(@RequestBody Users user){
		
		if(uservice.checkIfUserExists(user.getUserEmail())) {
			return ResponseEntity.badRequest().body("User is Already Present ");
		}
		
		Users u = uservice.addAdmin(user);
		if(u!=null) {
			return ResponseEntity.status(201).body(u.toString());
			
		}
		return ResponseEntity.badRequest().body("Password fields are not matching ");
		
	}
	
	
}
