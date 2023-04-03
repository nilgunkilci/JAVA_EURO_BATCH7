package days.day54.Car;

public class Car {

    private final Transmission transmission;
    private  Engine engine;
    private Transmission transmision;
    private Steering steering;
    private int wheels;

    public Car(Engine engine, Transmission transmission, Steering steering, int wheels) {
        this.engine = engine;
        this.transmission = transmission;
        this.steering = steering;
        this.wheels = wheels;
    }
    public void drive(){
        engine.start();
        transmision.shiftGear(1);
        steering.turn(90);
        System.out.println("Driving with " + wheels + " wheels");
    }
}
