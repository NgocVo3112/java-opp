package lession7_1;

import java.security.SecureRandom;

public class Eagle extends  Animal{

    @Override
    protected String name() {
        return "EAGLE";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(90);
    }

    @Override
    protected boolean isFlyAble() {
        return true;
    }
}
