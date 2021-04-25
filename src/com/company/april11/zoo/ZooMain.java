package com.company.april11.zoo;

import com.company.april11.zoo.animal.Tiger;
import com.company.april11.zoo.animal.breed.TigerBreed;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ZooMain {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Leo", 10, "male", TigerBreed.AMUR, 300);
        Class<? extends Tiger> tigerClass = tiger.getClass();
        Class<? extends Tiger> tc = Tiger.class;

        LocalDateTime dt = LocalDateTime.of(2021, Month.APRIL, 25, 12, 45);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm a");
        String formattedDate = formatter.format(dt);
        System.out.println(formattedDate);
    }
}
