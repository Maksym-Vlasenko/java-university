package com.company.april11.zoo.animal;

import com.company.april11.zoo.animal.breed.AnimalBreed;
import com.company.april11.zoo.animal.breed.TigerBreed;

public class Tiger extends Animal {
    private TigerBreed tigerBreed;
    private int weight;

    public Tiger(String name, int age, String gender, TigerBreed tigerBreed, int weight) {
        super(name, age, gender);
        this.tigerBreed = tigerBreed;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("Tiger jumps");
    }

    @Override
    public void talk() {
        System.out.println("The tiger say: RRRRRRR");
    }

    @Override
    public AnimalBreed getBreed() {
        return tigerBreed;
    }

    public void setTigerBreed(TigerBreed tigerBreed) {
        this.tigerBreed = tigerBreed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", breed=" + tigerBreed +
                ", weight=" + weight +
                '}';
    }
}
