package com.mjproject.apidemo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "bookings")
public class Booking {
    
    @Id
    private int id;


    private String title;

    @Column(name = "agency_listing_id")
    private Integer agencyListingId;
    // getter and setter

    public int getBookingId() {
        return this.id;
    }

    public void setBookingId(int id) {
        this.id = id;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAgencyListingId() {
        return this.agencyListingId;
    }

    public void setAgencyListingId(int agencyListingId) {
        this.agencyListingId = agencyListingId;
    }

}
