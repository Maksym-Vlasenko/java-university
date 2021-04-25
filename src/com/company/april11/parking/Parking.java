package com.company.april11.parking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Parking {
    private ParkingManager manager;
    private final List<Car> cars;
    private final List<Deal> deals;
    private final int parkingLots;

    public Parking(ParkingManager manager, int parkingLots) {
        this.manager = manager;
        this.parkingLots = parkingLots;
        this.cars = new ArrayList<>();
        this.deals = new ArrayList<>();
    }

    public void parkCar(Car car) {
        if (Objects.isNull(this.manager)) {
            System.out.println("No manager available at the moment, please, come back later");
            return;
        }
        if (parkingLots <= cars.size()) {
            System.out.println("No available slots");
            return;
        }
        this.cars.add(car);
        Deal deal = new Deal(manager, car.getOwner(), car, LocalDateTime.now());
        this.deals.add(deal);
        manager.incrementParkedCarsCount();
        System.out.println("Car " + car + " parked successfully");
    }

    public void unparkCar(Car car) {
        if (Objects.isNull(this.manager)) {
            System.out.println("No manager available at the moment, please, come back later");
            return;
        }
        if (cars.size() == 0) {
            System.out.println("No cars in parking lot");
            return;
        }
        this.cars.remove(car);
        System.out.println("Car" + car + "removed from the parking lot");
    }

    public List<Deal> getDeals() {
        return this.deals;
    }

    public void hireManager(ParkingManager manager) {
        fireManager(this.manager);
        this.manager = manager;
        System.out.println("Hired manager: " + manager + "\n");
    }

    public void fireManager(ParkingManager manager) {
        if (Objects.nonNull(this.manager)) {
            System.out.println("Fired manager: " + manager + "\n");
            this.manager = null;
        }
    }

    public ArrayList<Person> getCustomers() {
        ArrayList<Person> customers = new ArrayList<>();
        for (Deal deal : deals) {
            Person client = deal.getClient();
            customers.add(client);
        }
        System.out.println("Collected " + customers.size() + " customer(s)" + "\n");
        return customers;
    }

    public List<Deal> getPersonalDeals(Person person) {
        List<Deal> personDeals = new ArrayList<>();
        for (Deal deal : this.deals) {
            Person currentClient = deal.getClient();
            if (currentClient.equals(person)) {
                personDeals.add(deal);
            }
        }
        System.out.printf("Found %d deal(s) for the client: %s", personDeals.size(), person.toString());
        return personDeals;
    }

    public int getAvailableLots() {
        return parkingLots - cars.size();
    }

    public void printStatistic() {
        System.out.println("\nNumber of deals: " + deals.size());
        System.out.println("Available parking lots: " + getAvailableLots());
        System.out.println("Number of occupied places: " + cars.size());
        System.out.println("Manager: " + manager + "\n");
    }

}
