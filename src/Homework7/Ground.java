package Homework7;

public class Ground extends Vehicle{
    public int countOfWheels;
    public static int fuelConsumption;

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Ground(int power, int maxSpeed, int weight, String brand, int countOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;

    }
}
