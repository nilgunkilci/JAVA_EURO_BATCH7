package days.day33_StringClass_Methodlari;

public class Methods {
    public static void main(String[] args) {

        String sehir = "Istanbul";
        String ilce;
        ilce = new String("Bodrum");
        String kulup = new String("Besiktas");

        System.out.println("sehir.length() = " + sehir.length());
        // sehir Istanbul -----> lenght = 8
        //       01234567

        System.out.println("ilce.length() = " + ilce.length());
        // ilce  Bodrum  ----> lenght = 6
        //       012345

        System.out.println("sehir.charAt(0) = " + sehir.charAt(0));
        // diziyi saymaya sifirdan baslandigi icin 0. karakter I dir

        System.out.println("ilce.charAt(0) = " + ilce.charAt(0));
        // 0. karakter ilk siradaki karakterdir. ve B dir

        // String deki kelimenin dizilim sayisini bilmesek de lenght methodu ile bulunabilir.
        System.out.println("sehir.charAt(sehir.length()-1) = " + sehir.charAt(sehir.length() - 1));
        System.out.println("ilce.charAt(ilce.length()-1) = " + ilce.charAt(ilce.length() - 1));

        for (int i=0; i<sehir.length();i++){
            System.out.println("sehir.charAt(i) = " + sehir.charAt(i));

        }


    }
}
