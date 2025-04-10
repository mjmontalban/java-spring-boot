package com.mjproject.apidemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mjproject.apidemo.domain.Booking;
import com.mjproject.apidemo.repositories.BookingRepository;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Page<Booking> getBookingsByListingId(int listingId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        return bookingRepository.findByAgencyListingId(listingId, pageable);
    }
}
