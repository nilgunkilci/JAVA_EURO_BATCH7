package days.day51_Review._Vehicle;

import days.day51_Review._Vehicle.Car;

public class VehicleTest {
    public static void main(String[] args) {

        Car myCar = new Car (4,1000,"BMW");
        myCar.move();
        myCar.stop();
        myCar.hank();
        myCar.getWheels();
    }
}
