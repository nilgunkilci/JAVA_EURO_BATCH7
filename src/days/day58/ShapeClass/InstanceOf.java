package days.day58.ShapeClass;

public class InstanceOf {
    public static void main(String[] args) {

        Shape shape = new Circle();

        if (shape instanceof Triangle){
            System.out.println("Triangle");
        } else if (shape instanceof Square) {
            System.out.println("Square");
        } else if (shape instanceof Circle) {
            System.out.println("Circle");
        }
    }
}
