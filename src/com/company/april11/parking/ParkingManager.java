package com.company.april11.parking;

public class ParkingManager extends Person{
    private int seniority;
    private int parkedCarsCount;

    public ParkingManager(String name, String surname, int age, int seniority) {
        super(name, surname, age);
        this.seniority = seniority;
        this.parkedCarsCount = 0;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getParkedCarsCount() {
        return parkedCarsCount;
    }

    public void incrementParkedCarsCount() {
        this.parkedCarsCount++;
    }

    @Override
    public String toString() {
        return "ParkingManager{" +
                "seniority=" + seniority +
                ", parkedCarsCount=" + parkedCarsCount +
                '}';
    }
}
