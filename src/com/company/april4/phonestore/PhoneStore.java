package com.company.april4.phonestore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class PhoneStore {
    private final ArrayList<MobilePhone> phones;
    private final ArrayList<Order> orders;
    private Seller seller;

    public PhoneStore(Seller seller) {
        this.phones = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.seller = seller;
    }

    public void addPhone(MobilePhone phone) {
        this.phones.add(phone);
        System.out.println("Added phone to the phones list: " + phone + "\n");
    }

    public void addPhones(ArrayList<MobilePhone> phones) {
        for (MobilePhone phone : phones) {
            addPhone(phone);
        }
    }

    public void sellPhone(MobilePhone phone, Customer customer) {
        ArrayList<MobilePhone> phoneList = new ArrayList<>();
        phoneList.add(phone);
        sellPhones(phoneList, customer);
    }

    public void sellPhones(ArrayList<MobilePhone> phones, Customer customer) {
        LocalDateTime now = LocalDateTime.now();
        ArrayList<MobilePhone> phoneList = new ArrayList<>(phones);
        Order order = new Order(phoneList, this.seller, customer, now);
        customer.setMobilePhones(phoneList);
        this.orders.add(order);
        deletePhones(phones);
        System.out.println("Processed order " + order + "\n");
    }

    public void deletePhone(MobilePhone phone) {
        this.phones.remove(phone);
        System.out.println("Removed phone from the phones list: " + phone + "\n");
    }

    public void deletePhones(ArrayList<MobilePhone> phones) {
        for (MobilePhone phone : phones) {
            deletePhone(phone);
        }
    }

    public void fireSeller() {
        if (Objects.nonNull(this.seller)) {
            System.out.println("Fired seller: " + seller + "\n");
            this.seller = null;
        }
    }

    public void hireSeller(Seller seller) {
        this.seller = seller;
        System.out.println("Hired seller: " + seller + "\n");
    }

    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = new ArrayList<>();
        for (Order order : orders) {
            customers.add(order.getCustomer());
        }
        System.out.println("Collected " + customers.size() + " customer(s)" + "\n");
        return customers;
    }

    public ArrayList<Order> getOrders(){
        return orders;
    }

    public void printStatistics(){
        System.out.println("Current seller: " + seller);
        System.out.println("Phones in the store: " + phones.size());
        System.out.println("Processed orders: " + orders.size() + "\n");
    }
}
