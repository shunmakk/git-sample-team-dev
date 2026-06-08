package domain;

public class Car {
    private String name;
    private int long_speed;
    private boolean secondHand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return long_speed;
    }

    public void setSpeed(int long_speed) {
        this.long_speed = long_speed;
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
                ", long_speed=" + long_speed +
                ", secondHand=" + secondHand +
                ']';
    }
}
