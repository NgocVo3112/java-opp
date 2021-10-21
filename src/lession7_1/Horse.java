package lession7_1;

import java.security.SecureRandom;

public class Horse extends  Animal{

    @Override
    protected String name() {
        return "HORSE";
    }

    @Override
    protected int speed() {
        return new SecureRandom().nextInt(110);
    }

    @Override
    protected boolean isFlyAble() {
        return false;
    }
}
