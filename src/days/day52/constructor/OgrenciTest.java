package days.day52.constructor;

public class OgrenciTest {
    public static void main(String[] args) {

        Ogrenci ogrenci1 = new Ogrenci();
        ogrenci1.setAd("Ahmet");
        ogrenci1.setSoyad("Falanca");
        ogrenci1.setOkulNo(1234);

        Ogrenci ogrenci2 = new Ogrenci("Mehmet","Filanca",4567);
        Ogrenci ogrenci3 = new Ogrenci("Hasan","Filanca",567);
        Ogrenci ogrenci4 = new Ogrenci("Can","Filanca",457);
        Ogrenci ogrenci5 = new Ogrenci("Ayse","Filanca",47);
    }
}
