package com.company.april11.parking;

import java.time.LocalDateTime;

public class Deal {
    private ParkingManager manager;
    private Person client;
    private Car parkedCar;
    private LocalDateTime dealDate;

    public Deal(ParkingManager manager, Person client, Car parkedCar, LocalDateTime dealDate) {
        this.manager = manager;
        this.client = client;
        this.parkedCar = parkedCar;
        this.dealDate = dealDate;
    }

    public ParkingManager getManager() {
        return manager;
    }

    public void setManager(ParkingManager manager) {
        this.manager = manager;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public void setParkedCar(Car parkedCar) {
        this.parkedCar = parkedCar;
    }

    public LocalDateTime getDealDate() {
        return dealDate;
    }

    public void setDealDate(LocalDateTime dealDate) {
        this.dealDate = dealDate;
    }


    @Override
    public String toString() {
        return "Deal{" +
                "manager=" + manager +
                ", client=" + client +
                ", parkedCar=" + parkedCar +
                ", dealDate=" + dealDate +
                '}';
    }


}
