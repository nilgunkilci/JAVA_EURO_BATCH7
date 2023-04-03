package days.day67_Review.Composition;

public class DriverTest {
    public static void main(String[] args) {

        // compotion parcalarindan kücükten büyüge dogru object olusturuyoruz.
        Engine engine = new Engine(2000);
        Car car = new Car(engine, "Toyota", "Corolla");
        Driver driver = new Driver("John", car);

        System.out.println("Driver name : " + driver.getName());
        System.out.println("Car make : " + driver.getCar().getMake());
        System.out.println("Car model : " + driver.getCar().getModel());
        System.out.println("Engine horse power : " + driver.getCar().getEngine().getHorsePower());
    }

}
