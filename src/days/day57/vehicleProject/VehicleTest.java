package days.day57.vehicleProject;

public class VehicleTest {

    public static void main(String[] args) {

        Car car =new Car();
        car.start();
        car.stop();

        ElectricCar electricCar =new ElectricCar();
        electricCar.start();
        electricCar.stop();
        electricCar.charge();

        System.out.println(Car.MAX_SPEED);
        System.out.println(Vehicle.MAX_SPEED);
        System.out.println(ElectricVehicle.MAX_SPEED);
        System.out.println(ElectricVehicle.MAX_BATTRY_CAPACITY);
        System.out.println(ElectricCar.MAX_BATTRY_CAPACITY);
        System.out.println(ElectricCar.MAX_SPEED);


        // Variables defined in interface can not be reached via object
        // as they have been default "public, final, static"
        // car.MAX_SPEED
        // electricVehicle.Max_BATTERY_CAPACTY
    }
}
