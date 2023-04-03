package days.day49_Inheritance.vechicle;

public class VechicleTest {
    public static void main(String[] args) {

        Vechicle vec1= new Vechicle();
        vec1.name= "Otomobil";
        vec1.lenght=3;
        System.out.println(vec1.name);
        System.out.println(vec1.lenght);

        Car car1=new Car();
        car1.name= "Volvo";
        car1.seats=5;
        System.out.println(car1.name);
        System.out.println(car1.seats);

        Plane pln1= new Plane();
        pln1.name= "Airplane";
        System.out.println(pln1.name);

        // vec1.brand="";// Parents Class, child Class a ulasamaz

        // pln1.brand= ""; // bir child class, diger child class a ulasamaz
    }
}
