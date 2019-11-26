package com.moisjmelo.usersmvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moisjmelo.usersmvc.entities.User;
import com.moisjmelo.usersmvc.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		return repository.findAll();

	}
	
	public User findById(long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}

}
