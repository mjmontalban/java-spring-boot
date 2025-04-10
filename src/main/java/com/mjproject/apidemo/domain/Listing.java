package com.mjproject.apidemo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "listing")
public class Listing {
    
    @Id  // Marking the primary key
    private int listing_id;  // The field for the primary key

    
    // Other fields can be added here, such as name, description, etc.
    private String name;

    // Getter and setter for listing_id
    public int getListingId() {
        return this.listing_id;
    }

    public void setListingId(int listing_id) {
        this.listing_id = listing_id;
    }


    public String getUsername() {
        return this.name;
    }
    
    public void setUsername(String name) {
        this.name = name;
    }

}
