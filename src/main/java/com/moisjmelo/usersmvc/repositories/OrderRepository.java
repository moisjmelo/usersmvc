package com.moisjmelo.usersmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moisjmelo.usersmvc.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
