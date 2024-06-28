package Homework7;

public class PassengerCar extends Ground {
    public String typeOfBody;
    public int countOfPassengers;

    public PassengerCar(int power, int maxSpeed, int weight, String brand, int countOfWheels, int fuelConsumption, String typeOfBody, int countOfPassengers) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.typeOfBody = typeOfBody;
        this.countOfPassengers = countOfPassengers;
    }

    public void maxCountOfKmAndFuel(int time){
        System.out.println("За время " + time + " ч, автомобиль " + brand +
                " двигаясь с максимальной скоростью " + maxSpeed + " км/ч проедет " +
                time*maxSpeed + " км и израсходует " + time*maxSpeed*fuelConsumption/100 + " литров топлива.");
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public void setCountOfPassengers(int countOfPassengers) {
        this.countOfPassengers = countOfPassengers;
    }

    @Override
    public String toString() {
        return "PassengerCar: " +
                "typeOfBody= '" + typeOfBody + '\'' +
                ", countOfPassengers= " + countOfPassengers +
                ", countOfWheels= " + countOfWheels +
                ", fuelConsumption= " + fuelConsumption +
                ", power= " + power +
                ", powerKW=" + calculate() +
                ", maxSpeed= " + maxSpeed +
                ", weight= " + weight +
                ", brand= '" + brand + '\'';
    }
}
