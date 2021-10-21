package com.atyeti.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atyeti.rest.model.User;
import com.atyeti.rest.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public User registerUser(@RequestBody User user) throws Exception {

		User newUser = userService.userRegisterService(user);
		if (newUser == null) {
			throw new Exception("user Already Exist!! ");
		}
		return newUser;
	}

}
