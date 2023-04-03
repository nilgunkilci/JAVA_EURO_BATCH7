package days.day27;

public class Ogrenci {

    int numara;
    int yas;


    public static void main(String[] args) {
        Ogrenci ali = new Ogrenci();
        Ogrenci fatma;
        ali.yas = 15;
        ali.numara = 556;

        fatma = new Ogrenci();
        fatma.numara = 600;
        fatma.yas = 16;
        System.out.println("fatma.yas = " + fatma.yas);
        System.out.println("alinin yasi" + ali.yas);
        Ogrenci ronaldo = ali;
        System.out.println("ronaldo.yas = " + ronaldo.yas);
        ronaldo.printNumber(ronaldo);
        ali.printNumber(ali);
        printYas(ali);
        System.out.println("ali.yas = " + ali.yas);

    }

    void printNumber(Ogrenci ogrenci) {
        System.out.println("ogrenci.number = " + ogrenci.numara);
    }

    static void printYas(Ogrenci ogrenci) {
        ogrenci = new Ogrenci();
        System.out.println("ogrenci.yas = " + ogrenci.yas);
        ogrenci.yas = 20;
    }


}
