package days.day22;

public class C10_Google {
    public static void main(String[] args) {

        // Google a git
        // Arama Yap
        // Urunu bul sitesine git
        // Urunu sepete ekle
        // Odeme yap
        // Onay kodu al
        // Odemeyi tamamlayalim
        // Google a geri don
        System.out.println("Teste Basla");
        google();
        System.out.println("Testi Bitir");

    }

    public static void google(){
        System.out.println("Google sitesine gidildi");
        aramaYap();
    }

    public static void aramaYap(){
        System.out.println("Urun aratildi");
        System.out.println("Urun bulundu");
        urunSitesineGit();
    }

    public static void urunSitesineGit(){
        System.out.println("Urun sitesine gidildi");
        System.out.println("Urun secildi");
        sepeteEkle();
    }

    public static void sepeteEkle(){
        System.out.println("Urun sepete eklendi");
        odemeYap();
    }

    public static void odemeYap(){
        System.out.println("Hesap bilgileri girildi");
        onayKoduAl();
        System.out.println("Onay kodu girildi");
        System.out.println("Odeme tamamlandi");
        System.out.println("Googlea geri donuldu"); // google();
    }

    public static void onayKoduAl(){
        System.out.println("Onay kodu alindi");
    }
}


