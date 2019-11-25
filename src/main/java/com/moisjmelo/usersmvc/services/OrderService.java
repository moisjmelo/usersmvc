package com.moisjmelo.usersmvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moisjmelo.usersmvc.entities.Order;
import com.moisjmelo.usersmvc.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {

		return repository.findAll();

	}
	
	public Order findById(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();		
	}

}
