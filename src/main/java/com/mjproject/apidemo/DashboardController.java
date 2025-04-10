package com.mjproject.apidemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mjproject.apidemo.domain.Listing;
import com.mjproject.apidemo.services.ListingService;


@RestController
public class DashboardController {

    private ListingService listingService;

    @Autowired
    public void setListingService(ListingService listingService){
        this.listingService=listingService;
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
}
