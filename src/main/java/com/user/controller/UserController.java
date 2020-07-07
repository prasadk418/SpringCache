package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.domain.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid") Long userid) {
		return userService.getUser(userid).get();
	}
	
	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	public void updateUser() {
		
	}
	
	public void deleteUser() {
		
	}
}
