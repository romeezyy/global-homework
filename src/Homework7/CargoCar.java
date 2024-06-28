package Homework7;

public class CargoCar extends Ground {
    public int LoadCapacity;

    public CargoCar(int power, int maxSpeed, int weight, String brand, int countOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        LoadCapacity = loadCapacity;
    }

    public void isCargoFull(int weight){
        if (weight > getLoadCapacity()){
            System.out.println("Вам нужен грузовик побольше.");
        }
        else{
            System.out.println("Грузовик загружен");
        }
    }

    public int getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        LoadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "LoadCapacity=" + LoadCapacity +
                ", countOfWheels=" + countOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", powerKW=" + calculate() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
