package days.day44_StaticMembers1;

public class HesapMakinasiTest {
    public static void main(String[] args) {

       /* HesapMakinasi hsp1= new HesapMakinasi();
        hsp1.topla(5,6);
        System.out.println("hsp1.sonuc = " + hsp1.sonuc);

        */

        HesapMakinasi.topla(12,56);
        System.out.println("HesapMakinasi.sonuc = " + HesapMakinasi.sonuc);
        HesapMakinasi.sonuc=0;

        HesapMakinasi.topla(12,4,5);
        System.out.println("HesapMakinasi.sonuc = " + HesapMakinasi.sonuc);

        Ogrenci ogrenci1= new Ogrenci("HAsan");
        Ogrenci ogrenci2= new Ogrenci("Ali");
        Ogrenci ogrenci3= new Ogrenci("Ayse");
        Ogrenci ogrenci4= new Ogrenci("Sultan");
        Ogrenci ogrenci5= new Ogrenci("Elif");

      HesapMakinasi.ogrenciEkle(ogrenci1,ogrenci2,ogrenci3,ogrenci4,ogrenci5);


    }
}
