package com.moisjmelo.usersmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moisjmelo.usersmvc.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
