package com.company.november15;
import com.company.Car;

public class November15 {
    public static void main(String[] args) {
       /* University chnu = new University("Petro Mohyla Black Sea National University", "Mykolaiv",
                new String[]{
                        "Computer Science",
                        "Economics",
                        "History",
                        "Languages"
                });
        Student s = new Student("Alex", chnu, 20, 406, 4);
        System.out.println(s.toString());

        Student s1 = new Student("Oleg", chnu);
        System.out.println(s1.toString());

        Student s2 = new Student("Alina", 7);
        System.out.println(s2.toString());
        //System.out.println(s2.getAge());
        s2.setAge(10);
        System.out.println(s2.toString());
        //System.out.println(s2.getAge());
*/

        Car c1 = new Car("lambordgini", "LDF", "red", "Huracan", 325);
        c1.setSpeed(420);
        System.out.println(c1.toString());

        Car c2 = new Car("Ferrari", "Ferrari", "Superfast", 340);
        c2.setSpeed(300);
        System.out.println(c2.toString());

        Car c3 = new Car("Porsche", "Panamera", 200);
        c3.setSpeed(220);
        System.out.println(c3.toString());

        Car c4 = new Car("Mustang", 250);
        c4.setSpeed(310);
        System.out.println(c4.toString());

        Car c5 = new Car("Chevrolet", "blue");
        System.out.println(c5.toString());

        Car c6 = new Car("Range Rover", "SUV", "black", "SVA");
        System.out.println(c6.toString());

        Car c7 = new Car("Ford","yellow","GT");
        System.out.println(c7.toString());

        Car c8 = new Car("McLaren");
        System.out.println(c8.toString());

        Car c9 = new Car(500);
        c9.setSpeed(c9.getSpeed());
        System.out.println(c9.toString());

        Car c10 = new Car(null, null);
        System.out.println(c10.toString());
    }

}
