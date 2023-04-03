package days.day46_Encapsulation;

public class HorseTest {

    public static void main(String[] args) {



        Horse horse = new Horse();
        // public instance degerlere heryerden ulasim saglanir.
        horse.name= "Poyraz";

        // private instance variable  sadece kendi classindan erisilebilir.
        // bundan dolayi bu class da baska class daki private variable ulasilamz
        //horse.numberOfLegs= 5;

        // print methodu public oldugu icin erisilebilir.
        horse.print();
    }
}
