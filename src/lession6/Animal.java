package lession6;

public class Animal {
    private String name;
    private double speed;

    public Animal(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
