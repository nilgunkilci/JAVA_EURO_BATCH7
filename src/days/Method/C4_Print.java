package days.Method;

public class C4_Print {
    public static void main(String[] args) {

        // yazdir ( 5)
        // yazdir ("ALI")
        // yazdir ("Ronalda", 37)
        // yazdir (60,"Veli")
        // yazdir (10,5)
        // yazdir ("")
        yazdir(5);
        yazdir("Mesut");
        yazdir("Mesut", 12);
        yazdir(12, "Mesut");
        yazdir(12, 6);
        yazdir("Mesut", "Sert");


        // isim ile parametrenin birlikte adlandirilmasi signater
    }

    public static void yazdir(int a) {
        System.out.println(a);
    }public static void yazdir(String isim) {
        System.out.println(isim);
    }public static void yazdir(String isim, int yas) {
        System.out.println(isim + " " + yas);
    }public static void yazdir(int yas, String isim) {
        System.out.println(yas + " isim");
    }public static void yazdir(int yas, int sinif) {
        System.out.println(yas + " " + sinif);
    }public static void yazdir(String isim, String soyisim) {
        System.out.println(isim + " " + soyisim);
    }
}