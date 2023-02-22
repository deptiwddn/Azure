package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.UserRepo;
import com.example.demo.model.UserDetails;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired	   
	UserRepo userRepo;


	@Override
	public UserDetails addUser(UserDetails user) {
	
		return userRepo.save(user);
	}


	@Override
	public List<UserDetails> getAllUser() {
		
		return userRepo.findAll();
	}

	
	
}
