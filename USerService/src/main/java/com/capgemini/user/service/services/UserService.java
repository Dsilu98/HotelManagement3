package com.capgemini.user.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.user.service.entities.User;
import com.capgemini.user.service.repositories.UserRepository;

public interface UserService {
	
	//user operations
	
	//create
	User createUser(User user);
	
	
	//get all user
	List<User> getAllUser();
	
	//get single user
	User  getUser(String userId);
	
	//delete
	
	
	//update
	User updateUser(String id,User user);
	
}
