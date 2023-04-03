package days.day67_Review.Composition;

public class Car {
    private Engine engine;
    private String make;
    private String model;

    public Car(Engine engine, String make, String model) {
        this.engine = engine;
        this.make = make;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
