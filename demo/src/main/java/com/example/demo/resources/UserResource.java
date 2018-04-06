package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(path="api/")
public class UserResource {
	
	private UserService userService; //dependecy injection
	@Autowired
	public UserResource(UserService userService) {
		this.userService = userService;
	}
	@PostMapping(path="user")
	public User addUser(User user) {		
		return userService.addUser(user);
	}
	

}
