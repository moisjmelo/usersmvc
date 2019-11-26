package com.moisjmelo.usersmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moisjmelo.usersmvc.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
