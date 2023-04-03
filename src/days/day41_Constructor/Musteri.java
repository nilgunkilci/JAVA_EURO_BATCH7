package days.day41_Constructor;

public class Musteri {
    // Data members --- veri saklayan degiskenler.
    // bu class dan bir obje olusturuldugunda bu degiskenlere intence variable diyoruz
    String adi;
    int hesapNo;
    int kimlikNo;
    int telefonNo;
    double bakiye;

   // Musteri(String adi,int hesapNo,int kimlikNo) degiskenler cok fazla ise yazmak zor olabilir.
    // sag tikla generate ile otamatik constructor olusturulur.


    public Musteri() {
    }

    public Musteri(String adi, int kimlikNo) {
        this.adi = adi;
        this.kimlikNo = kimlikNo;
    }

    public Musteri(String adi, int hesapNo, int kimlikNo, int telefonNo, double bakiye) {
        this.adi = adi;
        this.hesapNo = hesapNo;
        this.kimlikNo = kimlikNo;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
    }
    public void showInfo(){
        System.out.println("**** Müşteri Bilgileri ****");
        System.out.println("----------------------------");
        System.out.println("Müşterinin adı           : " + this.adi);
        System.out.println("Müşterinin kimlik no     : " + this.kimlikNo) ;
        System.out.println("Müşterinin hesp no       : "  + this.hesapNo);
        System.out.println("Müşterinin telefon no    : " + this.telefonNo);
        System.out.println("Müşterinin hesap bakiyesi: " + this.bakiye);
    }
}



