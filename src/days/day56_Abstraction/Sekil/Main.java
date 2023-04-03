package days.day56_Abstraction.Sekil;

public class Main {

    public static void main(String[] args) {

      //   Sekil sekil = new Sekil()  ;
        // An abstract class can not be instantiated
        // we can not create an object from an abstract class

        Kare kare=new Kare();

        kare.cizme(); // abstract classtaki method a ulasilabilir

        // abstract class dan object olusturamasak da, oradaki static methodu absract class ismi ile cagirabiliriz
        Sekil.kaydir();

    }
}
