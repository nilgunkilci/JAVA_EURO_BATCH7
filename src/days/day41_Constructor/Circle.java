package days.day41_Constructor;

public class Circle {

    double radius ;

// No -argument Constructor  // parametreli constructor yazildiysa mutlaka parametresiz constructor yazmak zorundayiz.
// fakat hic yazmadiysa java zaten kendisi default deger olarak paremetresiz constructor arka planda calistirir.
    Circle(){
        // default constructor
        System.out.println(" Default No -argument Constructor called/invoked ");
        this.radius=1;  // hicbir deger atama yapilmadiysa bu default degeri kullanir.
    }
    // paremeter constructor
    Circle(double radius){
        System.out.println(" Parameterize constructor called/invoked - value of = " + radius);
        this.radius=radius;
    }

    // Method
   /* double getArea() {
        double area = radius * radius * Math.PI;
        return 1.0;
    }
    */

    double getArea() {

        return  radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
}
