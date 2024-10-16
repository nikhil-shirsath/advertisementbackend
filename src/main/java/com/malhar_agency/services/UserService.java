package com.malhar_agency.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malhar_agency.dao.UserDao;
import com.malhar_agency.entities.Users;

@Service
public class UserService {
	@Autowired
	private UserDao udao;

	public Users addUser(Users user) {
		// TODO Auto-generated method stub
		Users newUser = new Users();
		newUser.setUserFullName(user.getUserFullName());
		newUser.setUserEmail(user.getUserEmail());
		newUser.setRole("USER");
		newUser.setUserPassword(user.getUserPassword());
		newUser.setUserconfirmPassword(user.getUserconfirmPassword() );
		if(newUser.getUserPassword().equals(newUser.getUserconfirmPassword())) {
		return udao.save(newUser);
		}else {
			return null;
		}
		
	}

	public boolean checkIfUserExists(String userEmail) {
		// TODO Auto-generated method stub
		boolean isExist = udao.existsByuserEmail(userEmail);;
		System.out.println("\n\n"+isExist);
		return udao.existsByuserEmail(userEmail);
	}

	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return udao.findAllUsersOnly();
	}

	public Users addAdmin(Users user) {
		Users newUser = new Users();
		newUser.setUserFullName(user.getUserFullName());
		newUser.setUserEmail(user.getUserEmail());
		newUser.setRole("ADMIN");
		newUser.setUserPassword(user.getUserPassword());
		newUser.setUserconfirmPassword(user.getUserconfirmPassword() );
		if(newUser.getUserPassword().equals(newUser.getUserconfirmPassword())) {
		return udao.save(newUser);
		}else {
			return null;
		}
	}

}
