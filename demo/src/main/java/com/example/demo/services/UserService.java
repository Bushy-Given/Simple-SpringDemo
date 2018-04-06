package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;

@Service
public class UserService {

	private UserRepo userRepository;
	
	@Autowired
	public UserService(UserRepo userRepository) {
		this.userRepository = userRepository;
	}
	
	//to save a user 
	public User addUser(User user) {		
		return userRepository.save(user);
	}
	//find all users
	public Iterable<User> findAllUsers(){
		return userRepository.findAll();
	}
}
