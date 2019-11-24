package com.moisjmelo.usersmvc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.moisjmelo.usersmvc.entities.User;
import com.moisjmelo.usersmvc.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Moisés", "moisjmelo@gmail.com","81999293582","123");
		User u2 = new User(null, "Fulano", "fulanoo@gmail.com","81999293582","456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}
	
	

}
