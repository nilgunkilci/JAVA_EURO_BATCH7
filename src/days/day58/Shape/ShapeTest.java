package days.day58.Shape;

public class ShapeTest {

    public static void main(String[] args) {


        Shape[] shapes = new Shape[2];


        // Interface yoluyla farkli class larda farkli sekilde implement edilen methodun
        // objectler uzerinden iterate edilmesi ile, ayni code, ancak farkli hareket
        // yani polimorpic hareketi gormus olduk
        shapes[0] = new Circle();
        shapes[1] = new Square();
        for (Shape shape : shapes) {
            System.out.println(" The area of the shape is : " + shape.getArea());
        }


    }

}
