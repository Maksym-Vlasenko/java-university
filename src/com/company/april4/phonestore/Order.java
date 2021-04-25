package com.company.april4.phonestore;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private ArrayList<MobilePhone> mobilePhones;
    private Seller seller;
    private Customer customer;
    private LocalDateTime date;

    public Order(ArrayList<MobilePhone> mobilePhones, Seller seller, Customer customer, LocalDateTime date) {
        this.mobilePhones = mobilePhones;
        this.seller = seller;
        this.customer = customer;
        this.date = date;
    }

    public ArrayList<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(ArrayList<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mobilePhones=" + mobilePhones +
                ", seller=" + seller +
                ", customer=" + customer +
                ", date=" + date +
                '}';
    }
}
