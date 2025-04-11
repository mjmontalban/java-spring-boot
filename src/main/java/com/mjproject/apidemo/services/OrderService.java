package com.mjproject.apidemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mjproject.apidemo.domain.Order;
import com.mjproject.apidemo.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Page<Order> getOrdersByListing (int listingId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size); 


        return orderRepository.findByAgencyListingId(listingId, pageable);

    }
}
