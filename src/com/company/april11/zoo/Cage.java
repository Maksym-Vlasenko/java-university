package com.company.april11.zoo;

import com.company.april11.zoo.animal.Animal;
import com.company.april11.zoo.animal.breed.AnimalBreed;

import java.util.ArrayList;

public class Cage {
    private final Class<? extends AnimalBreed> animalType;
    private int capacity;
    private int area;
    private ArrayList<Animal> animals;

    public Cage(Class<? extends AnimalBreed> animalType, int capacity, int area, ArrayList<Animal> animals) {
        this.animalType = animalType;
        this.capacity = capacity;
        this.area = area;
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        AnimalBreed animalBreed = animal.getBreed();
        if (!this.animalType.equals(animalBreed.getClass())) {
            System.out.println("This cage can only contain animals of breed: " + animalBreed);
            return;
        }
        if (capacity >= animals.size()) {
            System.out.println("No available places left in a cage");
            return;
        }
        this.animals.add(animal);
        System.out.println("Animal " + animal + " was added to the cage");
    }

    public void removeAnimal(Animal animal) {
        AnimalBreed animalBreed = animal.getBreed();
        if (!this.animalType.equals(animalBreed.getClass())) {
            System.out.println("This cage contain only animals of breed: " + animalBreed);
            return;
        }
        this.animals.remove(animal);
    }

    public boolean contains(Animal animal) {
        return this.animals.contains(animal);
    }

    public boolean isEmpty() {
        return this.animals.isEmpty();
    }

    public boolean isFull() {
        return this.capacity <= this.animals.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Class<? extends AnimalBreed> getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Cage{" +
                "animalType=" + animalType +
                ", capacity=" + capacity +
                ", area=" + area +
                ", animals=" + animals +
                '}';
    }
}
