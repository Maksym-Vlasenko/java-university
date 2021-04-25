package com.company.april11.parking;

public class ParkingMain {
    public static void main(String[] args) {
        Person Max = new Person("Max", "Vlasenko", 19);
        Person Oleg = new Person("Oleg", "Ivanov", 27);
        Person Andrey = new Person("Andrey", "Skvortsov", 34);
        Person Maria = new Person("Maria", "Shatunova", 18);
        Person Mikhail = new Person("Mikhail", "Zubenko", 54);

        Car bmw = new Car("BMW", "i8", "Black", Max);
        Car Lamborghini = new Car("Lamborghini", "Huracan", "Blue", Oleg);
        Car Nissan = new Car("Nissan", "R34", "Black", Andrey);
        Car Mercedes = new Car("Mercedes", "W213", "Red", Maria);
        Car Vaz = new Car("VAZ", "2107", "white", Mikhail);

        ParkingManager Vitaliy = new ParkingManager("Vitaliy", "Morozov", 34, 15);
        ParkingManager Vova = new ParkingManager("Vova", "Ignatev", 21, 1);

        Parking parking = new Parking(Vitaliy , 8);
        parking.parkCar(Mercedes);
        parking.printStatistic();

        parking.fireManager(Vitaliy);
        parking.parkCar(Vaz);
        parking.printStatistic();
        parking.hireManager(Vova);
    }
}
