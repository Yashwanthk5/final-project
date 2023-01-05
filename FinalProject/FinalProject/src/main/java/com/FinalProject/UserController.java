package com.FinalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;

@RestController

public class UserController {
	@Autowired
	UserDao userDao;
	
	@GetMapping("/userLogin/{emailId}/{password}")
	public User getUserByName(@PathVariable("emailId") String emailId, @PathVariable("password") String password) {

		User user = userDao.userLogin(emailId, password);
		
		if (user != null)
			return user;
		
		return null;
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody User user) {
		User user1 = userDao.registerUser(user);
		
		if (user1 != null) {
			System.out.println("User Registered Successfully!!!");
			return "1";
		}
		
		System.out.println("User Registeration Failed!!!");
		return "0";
	}
}
