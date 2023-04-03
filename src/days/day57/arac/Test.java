package days.day57.arac;

public class Test {
    public static void main(String[] args) {

        Otomobil otomobil=new Otomobil();
        otomobil.setRenk("Red");
        otomobil.drive();

        Kamyon kamyon = new Kamyon();
        kamyon.setRenk("Blue");
        kamyon.drive();

        Motosiklet motosiklet=new Motosiklet();
        motosiklet.setRenk("Yellow");
        motosiklet.drive();

        Bisiklet bisiklet = new Bisiklet();
        bisiklet.setRenk("Black");
        bisiklet.drive();


}
}
