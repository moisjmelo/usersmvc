package com.moisjmelo.usersmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moisjmelo.usersmvc.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
