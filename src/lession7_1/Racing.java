package lession7_1;

import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal eagle = new Eagle();
        Animal horse = new Horse();
        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(eagle);
        animalList.add(horse);
        int max = 0;
        String win_name = null;
        for (Animal animal: animalList) {
            if (animal.isFlyAble()==false) {
                if (max < animal.speed())
                {
                    max = animal.speed();
                    win_name = animal.name();
                }
            }
        }
        System.out.printf("Winner is "+ win_name+" with speed %d", max);
    }
}
