package lesson6_2;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import static lesson6_2.Animal.Builder;

public class TestAnimal {
    public static void main(String[] args) {
        final int TIGER_MAX_SPEED = 100;
        final int EAGLE_MAX_SPEED = 100;
        final int MONKEY_MAX_SPEED = 70;
        Builder builder = new Builder();
        Animal tiger = builder.name("Tiger").speed(new SecureRandom().nextInt(TIGER_MAX_SPEED)).flyAble(false).build();
        Animal eagle = builder.name("Eagle").speed(new SecureRandom().nextInt(EAGLE_MAX_SPEED)).flyAble(true).build();
        Animal monkey = builder.name("Monkey").speed(new SecureRandom().nextInt(MONKEY_MAX_SPEED)).flyAble(false).build();
        System.out.println(eagle);
        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(eagle);
        animalList.add(monkey);
        int max = 0;
        String win_name = null;
        for (Animal animal: animalList) {
           if (animal.isFlyAble()==false) {
               if (max < animal.getSpeed())
               {
                   max = animal.getSpeed();
                   win_name = animal.getName();
               }
            }
        }
        System.out.println(max);
        System.out.printf("Winner is "+ win_name+" with speed %d", max);

    }
}
