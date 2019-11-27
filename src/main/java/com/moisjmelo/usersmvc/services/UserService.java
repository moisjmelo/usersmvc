package com.moisjmelo.usersmvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moisjmelo.usersmvc.entities.User;
import com.moisjmelo.usersmvc.repositories.UserRepository;
import com.moisjmelo.usersmvc.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {

		return repository.findAll();

	}
	
	public User findById(long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(( )-> new ResourceNotFoundException(id));		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updadteData(entity, obj);
		return repository.save(entity);
	}

	private void updadteData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
