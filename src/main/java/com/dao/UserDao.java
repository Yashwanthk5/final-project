package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserDao {
	@Autowired(required=true)	
	UserRepo userRepo;
	
	public User userLogin(String emailId, String password) {
		User user = userRepo.login(emailId, password);
		return user;
	}
	

	
	public User registerUser(User user) {
		return userRepo.save(user);
	}
}
