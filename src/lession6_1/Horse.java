package lession6_1;

import java.security.SecureRandom;

public class Horse extends Animal{
    public Horse(String name, double speed) {
        super(name, speed);
    }

    @Override
    public double getSpeed() {
        return new SecureRandom().nextInt(75);
    }
}
