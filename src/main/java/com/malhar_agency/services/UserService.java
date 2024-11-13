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

//	public Users addUser(Users user) {
//		// TODO Auto-generated method stub
//		Users newUser = new Users();
//		newUser.setUserFullName(user.getUserFullName());
//		newUser.setUserEmail(user.getUserEmail());
//		newUser.setRole("USER");
//		newUser.setUserPassword(user.getUserPassword());
//		newUser.setUserconfirmPassword(user.getUserconfirmPassword() );
//		if(newUser.getUserPassword().equals(newUser.getUserconfirmPassword())) {
//			System.out.println("\n\nusers password"+user.getUserPassword()+"\nconfirm user "+user.getUserconfirmPassword()+"\n");
//		return udao.save(newUser);
//		}else {
//			return null;
//		}
//		
//	}

	
	public Users addUser(Users user) {
	    Users newUser = new Users();
	    
	    // Setting the new fields from the incoming user object
	    newUser.setUserFirstName(user.getUserFirstName());  // Added field
	    newUser.setUserLastName(user.getUserLastName());    // Added field
	    newUser.setUserEmail(user.getUserEmail());
	    newUser.setUserPassword(user.getUserPassword());
	    newUser.setUserConfirmPassword(user.getUserConfirmPassword());  // Added field
	    newUser.setUserMobileNo(user.getUserMobileNo());  // Added field
	    newUser.setUserCity(user.getUserCity());          // Added field
	    newUser.setUserState(user.getUserState());        // Added field
	    newUser.setUserCountry(user.getUserCountry());    // Added field
	    newUser.setRole("USER");                          // Default role
	    
	    // Validate passwords match
	    if (newUser.getUserPassword().equals(newUser.getUserConfirmPassword())) {
	        System.out.println("Passwords match. Saving user with email: " + newUser.getUserEmail());
	        
	        try {
	            // Save the user using the data access object (DAO)
	            return udao.save(newUser);
	        } catch (Exception e) {
	            System.out.println("Error saving user: " + e.getMessage());
	            return null;
	        }
	    } else {
	        System.out.println("Passwords do not match.");
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

	    // Set the necessary fields from the incoming user object
	    newUser.setUserFirstName(user.getUserFirstName());  // Added field
	    newUser.setUserLastName(user.getUserLastName());    // Added field
	    newUser.setUserEmail(user.getUserEmail());
	    newUser.setUserPassword(user.getUserPassword());
	    newUser.setUserConfirmPassword(user.getUserConfirmPassword());  // Added field
	    newUser.setUserMobileNo(user.getUserMobileNo());  // Added field
	    newUser.setUserCity(user.getUserCity());          // Added field
	    newUser.setUserState(user.getUserState());        // Added field
	    newUser.setUserCountry(user.getUserCountry());    // Added field
	    newUser.setRole("ADMIN");                         // Role set to "ADMIN"

	    // Validate passwords match
	    if (newUser.getUserPassword().equals(newUser.getUserConfirmPassword())) {
	        System.out.println("Passwords match. Saving user with email: " + newUser.getUserEmail());
	        
	        try {
	            // Save the user using the data access object (DAO)
	            return udao.save(newUser);
	        } catch (Exception e) {
	            System.out.println("Error saving user: " + e.getMessage());
	            return null;
	        }
	    } else {
	        System.out.println("Passwords do not match.");
	        return null;
	    }
	}


}
