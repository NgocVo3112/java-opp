package lession6;

import java.security.SecureRandom;

public class Tiger extends Animal{
    public Tiger(String name, double speed) {
        super(name, speed);
    }

    @Override
    public double getSpeed() {
        return new SecureRandom().nextInt(100);
    }
}
