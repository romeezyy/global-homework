package Homework7;

public class Fly extends Vehicle {
    public int wings;
    public int minSizeForFly;

    public Fly(int power, int maxSpeed, int weight, String brand, int wings, int minSizeForFly) {
        super(power, maxSpeed, weight, brand);
        this.wings = wings;
        this.minSizeForFly = minSizeForFly;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getMinSizeForFly() {
        return minSizeForFly;
    }

    public void setMinSizeForFly(int minSizeForFly) {
        this.minSizeForFly = minSizeForFly;
    }
}
