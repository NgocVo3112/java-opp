package lession9_1;

import java.security.SecureRandom;

public class Eagle implements IAnimal{

    @Override
    public boolean isFlyAble() {
        return true;
    }

    @Override
    public String name() {
        return "EAGLE";
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(150);
    }


}
