package Homework7;

public class PassengerPlane extends Fly{
    public int countOfSeats;
    public boolean isBusiness;

    public PassengerPlane(int power, int maxSpeed, int weight, String brand, int wings, int minSizeForFly, int countOfSeats, boolean isBusiness) {
        super(power, maxSpeed, weight, brand, wings, minSizeForFly);
        this.countOfSeats = countOfSeats;
        this.isBusiness = isBusiness;
    }

    public void isPlaneFull(int passengers){
        if(passengers > countOfSeats){
            System.out.println("Самолет не полетит.");
        }
        else{
            System.out.println("Полетели!");
        }
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        this.countOfSeats = countOfSeats;
    }

    public boolean isBusiness() {
        return isBusiness;
    }

    public void setBusiness(boolean business) {
        isBusiness = business;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "countOfSeats=" + countOfSeats +
                ", isBusiness=" + isBusiness +
                ", wings=" + wings +
                ", minSizeForFly=" + minSizeForFly +
                ", power=" + power +
                ", powerKW=" + calculate() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
