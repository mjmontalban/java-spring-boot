package com.mjproject.apidemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjproject.apidemo.domain.Order;

public interface  OrderRepository extends JpaRepository<Order, Integer>{
    
}
