package domain;

public class Car {
    private String name;
    private int speed;
    private boolean secondHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }

    @Override
    public String toString() {
        return "Car[" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", secondHand=" + secondHand +
                ']';
    }
}
