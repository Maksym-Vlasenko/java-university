package com.company.april4.phonestore;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private ArrayList<MobilePhone> mobilePhones;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<MobilePhone> getMobilePhones() {
        return mobilePhones;
    }

    public void setMobilePhones(ArrayList<MobilePhone> mobilePhones) {
        this.mobilePhones = mobilePhones;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mobilePhones=" + mobilePhones +
                '}';
    }
}
