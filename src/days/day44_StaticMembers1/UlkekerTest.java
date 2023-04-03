package days.day44_StaticMembers1;

public class UlkekerTest {
    public static void main(String[] args) {

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke1=new Ulkeler("Turkiye","TR",90);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke2= new Ulkeler("Almanya", "D",49);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke3= new Ulkeler("USA","USA",1);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        System.out.println("ulke1 = " + ulke1);
        System.out.println("ulke2 = " + ulke2);
        System.out.println("ulke3 = " + ulke3);

        Ulkeler ulke4 = new Ulkeler("Ingiltere", "GB",48);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);
        System.out.println("ulke3.ulkelerSayac = " + ulke3.ulkelerSayac);

        ulke4.ulkelerSayac=345;

        System.out.println("ulke2.ulkelerSayac = " + ulke2.ulkelerSayac);

        ulke4.dummyCounter=23;
        System.out.println("ulke4.dummyCounter = " + ulke4.dummyCounter);
        System.out.println("ulke3.dummyCounter = " + ulke3.dummyCounter);

        Ulkeler ulke5 = new Ulkeler("Hindistan", "H",56);
        System.out.println("ulke5.ulkelerSayac = " + ulke5.ulkelerSayac);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
    }
}
