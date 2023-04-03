package days.day44_StaticMembers1;

public class HesapMakinasi {
    static double sonuc;

    static  void  topla( int sayiA, int sayiB){

        sonuc= sayiA+sayiB;
    }
    public static  void  topla( int ... sayi){ // Buradaki uc nokta var args

        System.out.println(sayi.length);
        for (int i = 0; i < sayi.length; i++) {
            System.out.println("sayi[i] = " + sayi[i]);
            sonuc+= sayi[i];

        }


    }public static void ogrenciEkle ( Ogrenci... ogrenciler){
        for( Ogrenci eleman: ogrenciler){
            System.out.println("eleman = " + eleman);
        }
    }

}
