package days.day41_Constructor;

public class CircleTest {
    public static void main(String[] args) {

        Circle daire1 = new Circle();
        // System.out.println("daire1 = " + daire1); daiere1 in  adres bilgisini verir

        daire1.radius=2;


        System.out.println(daire1.getArea());
        double alan= daire1.getArea();
        System.out.println( daire1.radius + " yaricapli Dairenin alani = " + alan);
        System.out.println(daire1.radius + " yaricapli Dairenin cevresi = " + daire1.getPerimeter());

        Circle daire2= new Circle(3.5);
        System.out.println("daire2.radius = " + daire2.radius);
        System.out.println( daire1.radius + " yaricapli Dairenin alani = " + daire2.getArea());
        System.out.println(daire1.radius + " yaricapli Dairenin cevresi = " + daire2.getPerimeter());
    }
}
