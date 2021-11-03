package lession9_1;

import java.security.SecureRandom;

public class Dog implements IAnimal{

    @Override
    public boolean isFlyAble() {
        return false;
    }

    @Override
    public String name() {
        return "DOG";
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(100);
    }
}
