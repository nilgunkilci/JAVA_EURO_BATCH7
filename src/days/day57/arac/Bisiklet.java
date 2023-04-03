package days.day57.arac;

public class Bisiklet extends Arac{

    public Bisiklet(){
        this.wheels=2;
    }

    public void drive(){
        System.out.println("Driving a " + color + " bisiklet with " + wheels + " wheels.");
    }
}
