package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;

@Service
public interface UserService {

	public  UserDetails addUser(UserDetails user);

	public List<UserDetails> getAllUser();

	
	
}
