package com.company.february21;

public class Cat extends Animal {
    private CatBreed breed;

    public Cat(String name, int age, CatBreed breed) {
        super(name, age);
        this.breed = breed;
    }

    public CatBreed getBreed() {
        return breed;
    }

    public void setBreed(CatBreed breed) {
        this.breed = breed;
    }

    @Override
    protected void printInfo() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", breed=" + breed +
                '}';
    }
}
