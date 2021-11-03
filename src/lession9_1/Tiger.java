package lession9_1;

import java.security.SecureRandom;

public class Tiger implements IAnimal{

    @Override
    public boolean isFlyAble() {
        return false;
    }

    @Override
    public String name() {
        return "TIGER";
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(120);
    }
}
