package com.company.april11.zoo;

import com.company.april11.zoo.animal.Animal;
import com.company.april11.zoo.animal.breed.AnimalBreed;
import com.company.april11.zoo.animal.breed.DeerBreed;
import com.company.april11.zoo.animal.breed.SnakeBreed;
import com.company.april11.zoo.animal.breed.TigerBreed;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zoo {
    private static final int TICKET_PRICE = 100;
    private final List<Cage> cages;
    private final int maxCagesCount;
    private final List<Order> orders;
    private final LocalTime opening;
    private final LocalTime closing;

    public Zoo(int maxCagesCount, LocalTime opening, LocalTime closing) {
        this.maxCagesCount = maxCagesCount;
        this.opening = opening;
        this.closing = closing;
        this.cages = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addCage(Class<? extends AnimalBreed> animalType, int capacity, int area) {
        if (this.maxCagesCount <= cages.size()) {
            System.out.println("No available slots left for the cages");
            return;
        }
        Cage newCage = new Cage(animalType, capacity, area, new ArrayList<>());
        this.cages.add(newCage);
    }

    public void addAnimal(Animal animal) {
        Class<? extends AnimalBreed> breedClass = animal.getBreed().getClass();
        List<Cage> filteredByBreed = filterCagesByBreedAndCapacity(breedClass);
        if (filteredByBreed.isEmpty()) {
            System.out.println("No available cages left for the breed: " + breedClass);
            return;
        }
        Cage first = filteredByBreed.get(0);
        first.addAnimal(animal);
    }

    public void removeAnimal(Animal animal) {
        Cage match = findCageByAnimal(animal);
        if (Objects.nonNull(match)) {
            match.removeAnimal(animal);
            return;
        }
        System.out.println(animal + " not found in Zoo");
    }

    public void sellTicket(Visitor visitor) {
        Order order = new Order(TICKET_PRICE, LocalDateTime.now(), visitor);
        this.orders.add(order);
    }

    public void sellTickets(List<Visitor> visitors) {
        for (Visitor visitor : visitors) {
            sellTicket(visitor);
        }
    }

    public List<Animal> getAnimalsByBreed(AnimalBreed breed) {
        Class<? extends AnimalBreed> breedClass = breed.getClass();
        List<Cage> filteredCages = filterCagesByBreed(breedClass);
        List<Animal> filteredAnimals = new ArrayList<>();
        for (Cage cage : filteredCages) {
            filteredAnimals.addAll(cage.getAnimals());
        }
        return filteredAnimals;
    }

    public int getAvailableCagesCount() {
        return this.maxCagesCount - this.cages.size();
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getOrdersForVisitor(Visitor visitor) {
        List<Order> filteredOrders = new ArrayList<>();
        for (Order order : this.orders) {
            if (order.getVisitor().equals(visitor)) {
                filteredOrders.add(order);
            }
        }
        return filteredOrders;
    }

    public void printCageDetails(Cage cage) {
        System.out.println(cage.toString());
        for (Animal animal : cage.getAnimals()) {
            animal.move();
            animal.talk();
        }
    }

    public void printInformation() {
        System.out.println("Available cages: " + getAvailableCagesCount());
        System.out.println("Taken cages: " + this.cages.size());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Opening time: " + formatter.format(this.opening));
        System.out.println("Closing time: " + formatter.format(this.closing));
        System.out.println("Snakes count: " + countAnimalsByBreed(SnakeBreed.class));
        System.out.println("Deer count: " + countAnimalsByBreed(DeerBreed.class));
        System.out.println("Tigers count: " + countAnimalsByBreed(TigerBreed.class));
    }

    private int countAnimalsByBreed(Class<? extends AnimalBreed> animalBreed) {
        List<Cage> filteredCages = filterCagesByBreed(animalBreed);
        int animalsCount = 0;
        for (Cage cage : filteredCages) {
            animalsCount += cage.getAnimals().size();
        }
        return animalsCount;
    }

    private Cage findCageByAnimal(Animal animal) {
        for (Cage cage : cages) {
            if (cage.contains(animal)) {
                return cage;
            }
        }
        return null;
    }

    private List<Cage> filterCagesByBreedAndCapacity(Class<? extends AnimalBreed> breedClass) {
        List<Cage> filteredByBreed = filterCagesByBreed(breedClass);
        List<Cage> nonFull = new ArrayList<>();
        for (Cage cage : filteredByBreed) {
            if (!cage.isFull()) {
                nonFull.add(cage);
            }
        }
        return nonFull;
    }

    private List<Cage> filterCagesByBreed(Class<? extends AnimalBreed> breedClass) {
        List<Cage> filteredByBreed = new ArrayList<>();
        for (Cage cage : this.cages) {
            if (breedClass.equals(cage.getAnimalType())) {
                filteredByBreed.add(cage);
            }
        }
        return filteredByBreed;
    }
}