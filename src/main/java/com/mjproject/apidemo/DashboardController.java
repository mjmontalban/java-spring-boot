package com.mjproject.apidemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mjproject.apidemo.domain.Booking;
import com.mjproject.apidemo.domain.Listing;
import com.mjproject.apidemo.domain.Order;
import com.mjproject.apidemo.services.BookingService;
import com.mjproject.apidemo.services.ListingService;
import com.mjproject.apidemo.services.OrderService;


@RestController
public class DashboardController {

    private ListingService listingService;
    private BookingService bookingService;
    private OrderService orderService;


    @Autowired
    public void setListingService(ListingService listingService){
        this.listingService=listingService;
    }

    @Autowired
    public void setBookingService(BookingService bookingService){
        this.bookingService=bookingService;
    }

    @Autowired
    public void setOrderService(OrderService orderService){
        this.orderService=orderService;
    }

    @GetMapping("/home")
    public ResponseEntity<Object> index() {
         Map<String, Object> response = new HashMap<>();
        response.put("status", true);
        response.put("message", "OK");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/user")
    public Listing getListing(@RequestParam String username) {
        return this.listingService.getUserByUsername(username);
    }


    @GetMapping("/bookings")
    public Page<Booking> getListingBookings(@RequestParam int listingId, @RequestParam int page, @RequestParam int size) {
        return this.bookingService.getBookingsByListingId(listingId, page, size);
    }

    @GetMapping("/orders")
    public Page<Order> getListingOrders(@RequestParam int listingId, @RequestParam int page, @RequestParam int size) {
        return this.orderService.getOrdersByListing(listingId, page, size);
    }
}
