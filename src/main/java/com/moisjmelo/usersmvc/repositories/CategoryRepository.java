package com.moisjmelo.usersmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moisjmelo.usersmvc.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
