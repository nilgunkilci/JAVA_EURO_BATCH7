package days.day58.ShapeClass;

import java.util.ArrayList;

public class ShapeList {
    public static void main(String[] args) {

        Shape [] shapes = new Shape[3];
        shapes[0]=new Square();
        shapes [1]= new Circle();
        shapes[2]= new Triangle();
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getName());
            shape.draw();
        }

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Square());
        shapeList.add(new Circle());
        shapeList.add(new Triangle());
        for (Shape shape : shapeList) {
            System.out.println(shape.getClass().getSimpleName());
            shape.draw();
        }
    }
}
