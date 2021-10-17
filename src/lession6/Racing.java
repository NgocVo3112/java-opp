package lession6;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger", new SecureRandom().nextInt(100));
        Horse horse = new Horse("Horse", new SecureRandom().nextInt(75));
        Dog dog = new Dog("Dog", new SecureRandom().nextInt(60));
        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        double max = dog.getSpeed();
        String win_name = null;
        for (Animal animal : animalList){
            if (max < animal.getSpeed()) {
                max = animal.getSpeed();
                win_name = animal.getName();
            }
        }
        System.out.println(max);
        System.out.printf("Winner is "+ win_name+" with speed %f", max);

    }
}
