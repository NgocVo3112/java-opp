package lession7_1;

import java.security.SecureRandom;

public class Dog extends  Animal{

    @Override
    protected String name() {
        return "DOG";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(80);
    }

    @Override
    protected boolean isFlyAble() {
        return false;
    }
}
