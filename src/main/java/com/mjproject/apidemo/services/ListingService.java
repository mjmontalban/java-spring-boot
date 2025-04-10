package com.mjproject.apidemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjproject.apidemo.domain.Listing;
import com.mjproject.apidemo.repositories.ListingRepository;

@Service
public class ListingService {

    @Autowired
    private ListingRepository listingRepository;

    public Listing getUserByUsername(String username) {
        return listingRepository.findByName(username);
    }
}
