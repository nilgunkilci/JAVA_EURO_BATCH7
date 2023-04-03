package days.day42_Constructor2.otoPark;

public class OtaparkProgram {
    public static void main(String[] args) {

        Otopark otoPark = new Otopark("Halk otoparki", "Checkpoint Berlin");
        System.out.println("otoPark = " + otoPark);

        Car araba1= new Car("BMW","HM-123-56");
        System.out.println("araba1 = " + araba1);

        Car araba2= new Car("Mercedes", " F-23-12");
        System.out.println("araba2 = " + araba2);


        otoPark.arabaEkle(araba1);
        otoPark.arabaEkle(araba2);
        otoPark.arabaListesi();
    }
}
