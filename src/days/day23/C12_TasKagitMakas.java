package days.day23;

public class C12_TasKagitMakas {

    public static void main(String[] args) {

        // Return method kullanarak tas kagit makas oyununun kazananini belirleyen bir method yazin

        String tas = "tas";
        String makas = "makas";
        String kagit = "kagit";

        String sonuc1 = tasKagitMakas(tas, tas);
        String sonuc2 = tasKagitMakas(tas, kagit);
        String sonuc3 = tasKagitMakas(tas, makas);
        String sonuc4 = tasKagitMakas(kagit, tas);
        String sonuc5 = tasKagitMakas(kagit, kagit);
        String sonuc6 = tasKagitMakas(kagit, makas);
        String sonuc7 = tasKagitMakas(makas, tas);
        String sonuc8 = tasKagitMakas(makas, makas);
        System.out.println("sonuc8 = " + sonuc8);
        System.out.println("sonuc7 = " + sonuc7);
        System.out.println("sonuc6 = " + sonuc6);
        System.out.println("sonuc5 = " + sonuc5);
        System.out.println("sonuc4 = " + sonuc4);
        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc1 = " + sonuc1);

    }

    public static String tasKagitMakas(String kisi1, String kisi2) {
        String sonuc;
        String tas = "tas";
        String makas = "makas";
        String kagit = "kagit";

        if (kisi1 == kisi2) {
            return "berabere kaldiniz";
        } else if (kisi1 == kagit && kisi2 != makas) {
            return " kisi1 oyunu kazandi";
        } else if (kisi1 == makas && kisi2 != tas) {
            return "kisi1 oyunu kazandi";
        } else if (kisi1 == tas && kisi2 != kagit) {
            return "kisi1 oyunu kazandi";
        } else
            return "kisi2 oyunu kazandi";

    }
}
