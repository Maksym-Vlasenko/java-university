package com.company.february21;

public class PoliceDog extends Dog {
    private int squadNumber;

    public PoliceDog(String name, int age, DogBreed breed, int squadNumber) {
        super(name, age, breed);
        this.squadNumber = squadNumber;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }
}
