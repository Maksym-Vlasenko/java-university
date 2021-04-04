package com.company.february14.lesson;

public class Building {
    private Entrance[] entrances;
    private int year;
    private int height;

    /*public Building(Entrance[] entrances, int year, int height) {
        this.entrances = entrances;
        this.year = year;
        this.height = height;
    }*/

    public Entrance[] getEntrances() {
        return entrances;
    }

    public void setEntrances(Entrance[] entrances) {
        if (entrances == null || entrances.length < 1) {
            System.out.println("неверное значение");
            return;
        }
        this.entrances = entrances;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2000 || year > 2021) {
            System.out.println("неверное значение");
            return;
        }
        this.year = year;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 1 || height > 100) {
            System.out.println("неверное значение");
            return;
        }
        this.height = height;
    }

    public void printInfo() {
        System.out.printf("Год постройки: %d%nВысота: %d%n", year, height);
        System.out.println("Информация о подъезде:");
        for (Entrance entrance : entrances) {
            entrance.printInfo();
        }
    }
}
