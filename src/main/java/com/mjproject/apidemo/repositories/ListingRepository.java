package com.mjproject.apidemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mjproject.apidemo.domain.Listing;

public interface ListingRepository  extends  JpaRepository<Listing, Integer>{
    Listing findByName(String username);

    Listing findById(int listing_id);
}
