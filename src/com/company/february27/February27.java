package com.company.february27;

public class February27 {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 40);
        alex.printInfo();

        Person ivan = new Student("Ivan", 20, "CHNU");
        ivan.printInfo();

        Phone phone = new Phone("Apple", "red", 876738986);
        System.out.println(phone);

        LandlinePhone phone1 = new LandlinePhone("LandlinePhone", "black", 758493857, 570);
        System.out.println(phone1)  ;

        MobilePhone phone2 = new MobilePhone("Meizu", "blue", 75774493, "Vodafon");
        System.out.println(phone2);
    }
}
