package days.day26;

public class C1_Dog { // Template class(Taslak class)

    // buraya main method koymadik cunku bu class objektlerin özelliklerinin belirlendigi class
    // ayrica burada exuced yapilmayacagi icin main method a ihtiyac yok
    // Instance variable /attiribute / field
    String ad;
    String cins;
    String renk;
    int yas;
    boolean evcil;
    char cinsiyet;

    // instance method a static yoktur. cünkü bir class a ait degildirder.
    // main method static oldugu icin main method olan class larda olusturulan methodlar static olmali.
    // aksi takdirde methodlar cagrilamaz
    public   void havla(){
        System.out.println("Havliyor...");
    }
    public void isir(){
        System.out.println("isiriyor...");
    }
    public void yemekYe(){
        System.out.println("Yemek yiyor...");
    }
    public void uyuyor(){
        System.out.println("Uyuyor...");
    }

}
