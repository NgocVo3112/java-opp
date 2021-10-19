package lesson6_2;

public class Animal {
    private final String name;
    private final int speed;
    private final boolean flyAble;

    public Animal(Builder builder) {
        name = builder.name;
        speed = builder.speed;
        flyAble = builder.flyAble;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyAble;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder speed (int speed) {
            this.speed = speed;
            return this;
        }

        public Builder flyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyAble=" + flyAble +
                '}';
    }
}
