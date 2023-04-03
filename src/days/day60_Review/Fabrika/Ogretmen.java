package days.day60_Review.Fabrika;

public class Ogretmen extends Person{


    public Ogretmen(String name, int age) {  // Constructor
        super(name, age);  // Parent classsin constroctor i cagirmak icin super();
    }

    @Override
    public void work() {
        System.out.println(this.getName()+" bu fabrikada ogretmen olarak calisiyorum");
    }

    @Override
    public String showInfo() {
        return    this.getName() + " - " + this.getAge() +" yasindayim."  ;
    }
    public void teach(){
        System.out.println( " Fabrikada hizmetici egitimlerde ders anlatiyorum");
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
