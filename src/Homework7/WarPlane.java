package Homework7;

public class WarPlane extends Fly {
    public boolean isCatapult;
    public int countOfRockets;

    public WarPlane(int power, int maxSpeed, int weight, String brand, int wings, int minSizeForFly, boolean isCatapult, int countOfRockets) {
        super(power, maxSpeed, weight, brand, wings, minSizeForFly);
        this.isCatapult = isCatapult;
        this.countOfRockets = countOfRockets;
    }

    public void rocketsSystem(){
        if(countOfRockets != 0){
            System.out.println("Ракета пошла!");
        }
        else {
            System.out.println("Боеприпасы отсутствуют.");
        }
    }
    public void catapult(){
        if(isCatapult){
            System.out.println("Катапультирование прошло успешно!");
        }
        else {
            System.out.println("У вас нет такой функции.");
        }
    }

    public boolean isCatapult() {
        return isCatapult;
    }

    public void setCatapult(boolean catapult) {
        isCatapult = catapult;
    }

    public int getCountOfRockets() {
        return countOfRockets;
    }

    public void setCountOfRockets(int countOfRockets) {
        this.countOfRockets = countOfRockets;
    }

    @Override
    public String toString() {
        return "WarPlane{" +
                "isCatapult=" + isCatapult +
                ", countOfRockets=" + countOfRockets +
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
