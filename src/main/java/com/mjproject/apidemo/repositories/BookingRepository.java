package com.mjproject.apidemo.repositories;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mjproject.apidemo.domain.Booking;


public interface  BookingRepository extends  JpaRepository<Booking, Integer>{
     Page<Booking> findByAgencyListingId(int listingId, Pageable pageable);
}
