package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	

}
