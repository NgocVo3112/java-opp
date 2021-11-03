package lession9_1;
import java.util.ArrayList;
import java.util.List;

public class Racing {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Tiger tiger = new Tiger();
        List<IAnimal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(eagle);
        animalList.add(tiger);
        for (IAnimal animal: animalList) {
            System.out.printf("Animal "+ animal.name()+" with speed %d", animal.speed());
        }
        int max = 0;
        String win_name = null;
        for (IAnimal animal: animalList) {
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
