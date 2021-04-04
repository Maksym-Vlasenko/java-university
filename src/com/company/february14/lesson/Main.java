package com.company.february14.lesson;

public class Main {
    public static void main(String[] args) {
      /*  Car bmw = new Car("BMW", "i8", "BE 1233 BO", Color.GREEN);
        Car lamborghini = new Car("Lamborghini", "Aventador", "6578", Color.BLUE);

        System.out.println(bmw.getNumber());
        bmw.setNumber(null);
        System.out.println(bmw.getNumber());
  */

        Floor floor = new Floor(4, 150, 1);
        Floor floor1 = new Floor(3,120,2);
        Floor floor2 = new Floor(5,180,3);
        Floor [] floors = {floor,floor1,floor2};

        Entrance entrance = new Entrance(floors, 1, true);
        Floor floor3 = new Floor(3, 110, 1);
        Floor floor4 = new Floor(2,130,2);
        Floor floor5 = new Floor(1,100,3);
        Floor [] floors1 = {floor3,floor4,floor5};

        Entrance entrance1 = new Entrance(floors1, 2, false);
        Entrance [] entrances = {entrance,entrance1};

        Building building = new Building();
        building.setEntrances(entrances);
        building.setYear(2015);
        building.setHeight(100);
        building.printInfo();
        System.out.println("Height: " + building.getHeight());
    }
}