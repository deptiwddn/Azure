package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserService;


@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getUser")
	public List<UserDetails> getAllUser() {
		return this.userService.getAllUser();
	}
	
	@GetMapping("/")
	public String check() {
		return "running fine";
	}
	
	@PostMapping("/addUser")
    public UserDetails addUser(@RequestBody UserDetails user){
        return this.userService.addUser(user);
    }

}
