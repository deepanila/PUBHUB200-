package com.bookshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopping.model.Order;
import com.bookshopping.repository.OrderItemRepository;
import com.bookshopping.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderrepository;
	@Autowired
	private OrderItemRepository orderitemrepository;
	
	public void save(Order order) {
		orderrepository.save(order);
		
	}
	
	public List<Order> findAllOrders(){
		return orderrepository.findByOrderByIdDesc();
	}
	
	public List<Order> findAll(){
		return orderrepository.findAll();
	}
	
	public Order findOne(Integer id){
		return orderrepository.findOne(id);
	}
	
	public List<Order> findByUserIdOrderByIdDesc(int userId){
		return orderrepository.findByUserIdOrderByIdDesc(userId);
	}



}
