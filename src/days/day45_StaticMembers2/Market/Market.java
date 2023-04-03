package days.day45_StaticMembers2.Market;

import java.util.Date;

public class Market {
    public static void main(String[] args) {

        System.out.println("ABC markete hosgeldiniz");

        Urun urun1= new Urun("Elma",15,5, "yiyecek");
        Urun urun2= new Urun("Peynir",150,1, "yiyecek");
        Urun urun3= new Urun("Detrjn",250,1, "temizlik");

        Sepet sepet = new Sepet();
        sepet.sepetEkle(urun1);
        sepet.sepetEkle(urun2);
        sepet.sepetEkle(urun3);

       // System.out.println("sepet = " + sepet);

        Fatura fatura = new Fatura(new Date(),sepet);
        System.out.println(fatura);
        System.out.println();

        Sepet sepet1 = new Sepet();
        sepet1.sepetEkle(urun1);

        Fatura fatura1 = new Fatura(new Date(),sepet1);
        System.out.println(fatura1);

    }
}
