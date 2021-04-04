package com.company.march6;

import java.awt.*;

public class March6 {

    public static void main(String[] args) {
        Color[] colors = new Color[]{Color.BLACK, Color.YELLOW};
        Pet Mukhtar = new PoliceDog("Alex", 6, colors, Dog.DogBread.SHEPHERD, "LS_PD");
        System.out.println(Mukhtar);
        Falcon Winged = new Falcon("Winged", 5, colors, Bird.BirdType.FALCON, "rabbit");
        System.out.println(Winged);
        Parrot Kesha = new Parrot("Kesha", 8, colors, Bird.BirdType.PARROT, "apple");
        System.out.println(Kesha);
        DecorativeDog Chapi = new DecorativeDog("Chapi", 17, colors, Dog.DogBread.HUSKY, "ball");
        System.out.println(Chapi);

        Mukhtar.voice();
        Winged.voice();

        Pet p1 = new Pet("My pet", 5, new Color[]{Color.RED, Color.WHITE, Color.GREEN}) {
            @Override
            public void voice() {
                System.out.println("My anonymous pet");
            }
        };

        Elephant e1 = new Elephant("Elephante", 14, new Color[]{Color.GRAY}, "African");
        Elephant e2 = new Elephant("Elephante", 14, new Color[]{Color.GRAY}, "Tropic");
        System.out.println(e1.equals(e2));

    }

    private static void testType(Pet pet) {
        if (pet instanceof PoliceDog) {
            PoliceDog policeDog = (PoliceDog) pet;
            System.out.println("Police dog: " + policeDog.toString());
            System.out.println("Department: " + policeDog.getPoliceDepartment());
        } else {
            System.out.println("This pet is not a police dog");
            System.out.println(pet.toString());
        }
    }
}
