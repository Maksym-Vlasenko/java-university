package com.company.march20;

public class SportCar extends RoadTransport {

    public SportCar(String vendor, String model) {
        super(vendor, model);
    }

    @Override
    public void run() {
        System.out.println("Sport car rides");
    }
}
