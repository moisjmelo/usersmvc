package com.moisjmelo.usersmvc.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moisjmelo.usersmvc.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Moisés", "moisjmelo@gmail.com","81999293582","123");
		return ResponseEntity.ok().body(u);
		
	}

}
