package com.malhar_agency.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.malhar_agency.entities.Users;

public interface UserDao  extends JpaRepository<Users, Long>{

	
	boolean existsByuserEmail(String email);
	
	@Query("SELECT u FROM Users u WHERE u.role = 'USER'")
    List<Users> findAllUsersOnly();

}
