package com.company.march20;

public class March20 {
    public static void main(String[] args) {
        SportCar bmw = new SportCar("BMW", "i8");
        bmw.run();
        bmw.beep();

        SportBike suzuki = new SportBike("Suzuki", 150);
        suzuki.run();
        suzuki.beep();

        Transport.showType();
        RoadTransport roadTransport = new SportCar("BMW", "M3");
        TransportType road = TransportType.ROAD;
        String fullName = road.getFullName();

        int a = 10;
        int b = 5;
        Operation sum = Operation.SUM;
        Operation subtract = Operation.SUBTRACT;
        Operation multiply = Operation.MULTIPLY;
        Operation divide = Operation.DIVIDE;
        System.out.println(a + " + " + b + " = " + sum.apply(a, b));
        System.out.println(a + " - " + b + " = " + subtract.apply(a, b));
        System.out.println(a + " * " + b + " = " + multiply.apply(a, b));
        System.out.println(a + " / " + b + " = " + divide.apply(a, b));
        Operation[] allOperations = Operation.values();
        int sumNum = sum.ordinal();
        Operation sum1 = Operation.valueOf("SUM");


        startTransport(bmw);
        startTransport(suzuki);
        Transport t = create(TransportType.ROAD);

    }

    private static void startTransport(Transport transport) {
        transport.run();
    }

    private static Transport create(TransportType transportType) {
        switch (transportType) {
            case ROAD:
                return new SportCar("test", "test");
            default:
                return null;
        }
    }
}
