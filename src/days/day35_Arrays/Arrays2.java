package days.day35_Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        String[] sehirler = {"Istanbul", "Tranzon", "Agri", "Mardin", "Antalya"};
        // for each ile sehirler array elemanlarini yazdirma
        for (String sehir : sehirler) {
            System.out.println("sehir = " + sehir);

        }
        int[] sayilar = {1, 25, 65, 56, 100, 150, 76};
        // for each ile sayilar array elemanlarini yazdirma
        for (int sayi : sayilar) {
            System.out.println("sayi = " + sayi);

        }
        // array in uzunlugunu buömak icin for kullanilabilir. fakat .length methodu var.
        int i = 0;
        for (String sehir : sehirler) {
            i++;
        }
        System.out.println("i = " + i);
        System.out.println("sehirler.length = " + sehirler.length);

        //  TASK : degeri 50 uzeri olan elementleri yazdirin
        int sayac = 0;
        for (int sayi : sayilar) {
            if (sayi >= 50) {
                System.out.println("sayi = " + sayi);
                sayac++;
            }
        }
        System.out.println("50 uzerinde " + sayac + " tane sayi vardir");


    }
}
