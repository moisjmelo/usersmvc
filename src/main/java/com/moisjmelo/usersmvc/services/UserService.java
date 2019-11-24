package com.moisjmelo.usersmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moisjmelo.usersmvc.entities.User;
import com.moisjmelo.usersmvc.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		
		return repository.findAll();
		
	}

}
