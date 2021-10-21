package com.atyeti.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atyeti.rest.model.User;
import com.atyeti.rest.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public User userRegisterService(User user) {

		if (userRepo.findByusername(user.getUsername()) != null) {
			return null;
		}
		return userRepo.save(user);

	}

}
