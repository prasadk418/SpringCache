package com.user.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.user.domain.User;
import com.user.repo.UserRepository;

@Service	
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	@Cacheable("user")
	public Optional<User> getUser(Long userId) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Method executed...!");
		return userRepo.findById(userId);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		userRepo.deleteById(userId);		
	}

	
}
