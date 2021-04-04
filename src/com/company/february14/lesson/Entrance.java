package com.company.february14.lesson;

public class Entrance {
    private Floor[] floors;
    private int number;
    private boolean elevatorPresent;

    public Entrance(Floor[] floors, int number, boolean elevatorPresent) {
        this.floors = floors;
        this.number = number;
        this.elevatorPresent = elevatorPresent;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        if (floors == null || floors.length < 1) {
            System.out.println("неверное значение");
            return;
        }
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 1) {
            System.out.println("неверное количество подьезда");
            return;
        }
        this.number = number;
    }

    public boolean isElevatorPresent() {
        return elevatorPresent;
    }

    public void setElevatorPresent(boolean elevatorPresent) {
        this.elevatorPresent = elevatorPresent;
    }

    public void printInfo() {
        System.out.printf("Номер подъезда: %d%nНаличие лифта: %b%n", number, elevatorPresent);
        System.out.println("Информация о этаже:");
        for (Floor floor : floors) {
            floor.printInfo();
        }
    }
}
