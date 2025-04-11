package com.mjproject.apidemo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booking_orders")
public class Order {
    
    @Id
    private int id;

    private String title;
    private String type;
    private Double amount;
    @Column(name = "order_no")
    private String orderNumber; 

    @Column(name = "agency_listing_id")
    private Integer agencyListingId;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getOrderNumber() {
        return this.orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getAgencyListingId() {
        return this.agencyListingId;
    }

    public void setAgencyListingId(int agencyListingId) {
        this.agencyListingId = agencyListingId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
