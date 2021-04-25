package com.company.april4.phonestore;

import java.util.ArrayList;

public class PhoneStoreMain {
    public static void main(String[] args) {
        Display samsungDisplay = new Display(1280, 760, 200);
        Display appleDisplay = new Display(1920, 1080, 350);

        MobilePhone galaxyS20 = new MobilePhone("Samsung", "Galaxy S20", 2019, samsungDisplay);
        MobilePhone galaxyS30 = new MobilePhone("Samsung", "Galaxy S30", 2020, samsungDisplay);
        MobilePhone iphone7 = new MobilePhone("Apple", "iPhone 7", 2016, appleDisplay);
        MobilePhone iphone8 = new MobilePhone("Apple", "iPhone 8", 2019, appleDisplay);
        MobilePhone iphone12Pro = new MobilePhone("Apple", "iPhone 12 Pro", 2021, appleDisplay);
        ArrayList<MobilePhone> phones = new ArrayList<>();
        phones.add(galaxyS20);
        phones.add(galaxyS30);
        phones.add(iphone7);
        phones.add(iphone8);
        phones.add(iphone12Pro);

        Seller alex = new Seller("Alex", "Ivanov", 25, 3);
        Seller olga = new Seller("Olga", "Petrova", 40, 15);

        PhoneStore store = new PhoneStore(alex);
        store.addPhones(phones);

        Customer ivan = new Customer("Ivan", "Filatov");
        store.sellPhone(galaxyS30, ivan);
        store.printStatistics();

        Customer vitaly = new Customer("Vitaly", "Sidorov");
        ArrayList<MobilePhone> vitalyPhones = new ArrayList<>();
        vitalyPhones.add(iphone7);
        vitalyPhones.add(iphone8);
        store.sellPhones(vitalyPhones, vitaly);
        store.printStatistics();

        store.fireSeller();
        store.hireSeller(olga);
        store.printStatistics();

        Customer maksym = new Customer("Maksym", "Vlasenko");
        store.sellPhone(iphone12Pro, maksym);
        store.printStatistics();

        Customer andrey = new Customer("Andrey", "Orlov");
        ArrayList<MobilePhone> andreyPhones = new ArrayList<>();
        andreyPhones.add(iphone7);
        andreyPhones.add(galaxyS20);
        store.sellPhones(andreyPhones, andrey);
        store.printStatistics();

        store.getCustomers();
    }
}
