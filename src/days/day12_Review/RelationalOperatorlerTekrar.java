package days.day12_Review;

public class RelationalOperatorlerTekrar {
    public static void main(String[] args) {

        // ><  >= <=   ==   !=   boolean deger döndürür.
        int a = 10;
        int b = 20;
        System.out.println((a > b));

        boolean sonuc = a > b;

        System.out.println("sonuc = " + sonuc);
        // System.out.println("a>b = " + a > b);  bu hata verir cünkü string islem yapiyor . ve string de > islemi yok


        int num = 21;
        boolean ciftSayi = num % 2 == 0;
        System.out.println("ciftSayi = " + ciftSayi);
        if(ciftSayi==false){
            System.out.println("numara tek sayidir");
        }

    }
}
