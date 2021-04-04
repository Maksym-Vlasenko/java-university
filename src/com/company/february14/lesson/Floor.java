package com.company.february14.lesson;

public class Floor {
    private int flatsNumber;
    private int area;
    private int number;

    public Floor(int flatsNumber, int area, int number) {
        this.flatsNumber = flatsNumber;
        this.area = area;
        this.number = number;
    }

    public int getFlatsNumber() {
        return flatsNumber;
    }

    public void setFlatsNumber(int flatsNumber) {
        if (flatsNumber < 2 || flatsNumber > 5) {
            System.out.println("неверное количество квартир");
            return;
        }
        this.flatsNumber = flatsNumber;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area < 100) {
            System.out.println("указана неверная площадь");
            return;
        }
        this.area = area;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 1) {
            System.out.println("указано неверное количество этажей");
            return;
        }
        this.number = number;
    }

    public void printInfo() {
        System.out.printf("Количество квартир на этаже: %d%nОбщая площадь этажа: %d%nНомер этажа: %d%n", flatsNumber, area, number);
    }
}
