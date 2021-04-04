package com.company.february21;

public class Dog extends Animal {
    private DogBreed breed;

    public Dog(String name, int age, DogBreed breed) {
        super(name, age);
        this.breed = breed;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public void setBreed(DogBreed breed) {
        this.breed = breed;
    }

    @Override
    public void printInfo() {
        System.out.println("Dog breed: " + breed);
    }

    @Override
    public final String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", breed=" + breed +
                '}';
    }
}
