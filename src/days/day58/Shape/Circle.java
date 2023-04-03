package days.day58.Shape;

public class Circle implements Shape {

    public double radius = 2.1;

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
