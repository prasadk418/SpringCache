package com.user.service;

import java.util.List;
import java.util.Optional;

import com.user.domain.User;

public interface UserService {
	
	public List<User> getAllUsers();
	public Optional<User> getUser(Long userId);
	public User saveUser(User user) ;
	public User updateUser(User user);
	public void deleteUser(Long userId) ;

}
