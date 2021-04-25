package com.company.april11.zoo.animal;

import com.company.april11.zoo.animal.breed.AnimalBreed;
import com.company.april11.zoo.animal.breed.SnakeBreed;

public class Snake extends Animal {
    private SnakeBreed snakeBreed;
    private int length;

    public Snake(String name, int age, String gender, SnakeBreed snakeBreed, int length) {
        super(name, age, gender);
        this.snakeBreed = snakeBreed;
        this.length = length;
    }

    @Override
    public void move() {
        System.out.println("Snake crawls");
    }

    @Override
    public void talk() {
        System.out.println("The snake say: SSSSSSSS");
    }

    @Override
    public AnimalBreed getBreed() {
        return snakeBreed;
    }

    public void setSnakeBreed(SnakeBreed snakeBreed) {
        this.snakeBreed = snakeBreed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", snakeBreed=" + snakeBreed +
                ", length=" + length +
                '}';
    }
}
