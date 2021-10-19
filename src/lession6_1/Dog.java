package lession6_1;

import java.security.SecureRandom;

public class Dog extends Animal{

    public Dog(String name, double speed) {
        super(name, speed);
    }

    @Override
    public double getSpeed() {
        return new SecureRandom().nextInt(60);
    }
}
