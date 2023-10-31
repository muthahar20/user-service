package com.mtr.userservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtr.userservice.model.User;


@RestController
@RequestMapping("/api/users")
public class UserController {

	
	static List<User> userData = new ArrayList<>();

	@PostMapping("/createUser")
	private User createUserInfo(@RequestBody User user) {
		
		User user1 = new User();
		user1.setFirstName(user.getFirstName());
		user1.setLastName(user.getLastName());
		user1.setLocation(user.getLocation());
		user1.setMobileNumber(user.getMobileNumber());
		user1.setGender(user.getGender());
		
		userData.add(user1);
		
		return user1;
		
	}
	
	
	 @GetMapping
	private List<User> getAllUserInfo() {
		return getUserData();
	}
	
	
	
	
	
	
	
	
	public static List<User> getUserData(){
		
		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("P");
		user1.setLocation("USA");
		user1.setMobileNumber("16015339999");
		user1.setGender("Male");
		
		User user2 = new User();
		user2.setFirstName("Andrew");
		user2.setLastName("J");
		user2.setLocation("Canada");
		user2.setMobileNumber("16015339988");
		user2.setGender("Male");
		
		userData.add(user1);	userData.add(user2);
		
		return userData;
		
		
		
	}
	
}
