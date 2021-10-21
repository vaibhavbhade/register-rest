package com.atyeti.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atyeti.rest.model.User;

public interface UserRepo extends JpaRepository<User, Long>{

	
	public User findByusername(String username);
}
