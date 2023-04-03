package days.day46_Encapsulation;

public class Horse {

    // Object Oriented Programming (OOP) Principles
    // ! Encapsulation (KAPSÜLLEME/SARMALLAMA)
    // ! Inheritance (KALITIM/MİRAS ALMA)
    // ! Abstraction (SOYUTLAMA)
    // ! Polymorphism (ÇOK BİÇİMCİLİK)

             // ! Encapsulation (KAPSÜLLEME/SARMALLAMA)
             //  bir sınıfın içerisinde bulunan metodların ve değişkenlerin korumasıdır.
             // İçerisinde bulunan metod ve değişkenlere dışarıdan ne seviyede  erişilebileceğini kapsülleme ile sağlayabiliriz.
             // gizlenen variable ve methodlara sinif icinden ulasilabilr.
             // amac kodlarin kullanicidan gizlenmesidir, gereksiz ve karisik mudahalelere izin vermemek icin
            // data hiding
    /*
        *****    Encapsulation yapmak icin variable ve methodlari yazarken "private " olarak yazmaliyiz

Bu erişim belirleyiciler (access modifiers);
      Public: Her yerden erişilebilir.
      Private: Sadece tanımlandığı sınıf içerisinden erişilebilir.
      Internal: Sadece bulunduğu projede erişilebilir.
      Protected: Sadece tanımlandığı sınıfta ya da o sınıfı miras alan sınıflardan erişilebilir.
      Protected Internal: Sadece tanımlandığı sınıfta ya da o sınıfı miras alan sınıflardan erişilebilir.
                         Ayrıca tanımlamanın aynı proje içerisinde olma şartı yoktur. Protected’dan farkı budur.
      Not:Eğer erişim belirleyici belirtilmemişse, sınıflar  internal’dır.

    */


     public String name;
     private int numberOfLegs;

    public void  print(){

        System.out.println(name+" "+ numberOfLegs);
    }
}
