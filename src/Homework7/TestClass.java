package Homework7;

public class TestClass {
    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar(300, 280, 2000, "Audi", 4, 15, "Hatchback", 4);
        System.out.println(audi);
        audi. maxCountOfKmAndFuel(5);
        CargoCar belAz = new CargoCar(500, 70,2000, "BelAZ", 6, 30, 15);
        System.out.println(belAz);
        belAz.isCargoFull(6);
        PassengerPlane boeing = new PassengerPlane(500, 1000, 3000, "Boeing", 50, 500, 150, true);
        System.out.println(boeing);
        boeing.isPlaneFull(180);
        WarPlane su = new WarPlane(1000, 1500, 2000, "Su-35", 40, 300, false, 0);
        System.out.println(su);
        su.catapult();
        su.rocketsSystem();
    }
}
