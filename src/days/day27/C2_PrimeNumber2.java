package days.day27;

public class C2_PrimeNumber2 {
    public static void main(String[] args) {


        // ilk .... adet asal sayiyi yazdir.

        asalSayilar(6);

    }

    static void asalSayilar(int adet) {
        boolean asalSayiMi = true;
        int son = 3;
        int sayac = 0;
        for (int i = 2; i < son; i++) {
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    asalSayiMi = false;
                }
            }
                if (asalSayiMi) {
                    System.out.println(i + " asal sayidir");
                    sayac++;  // adet sayisini belirlemek icin sayac kullaniyoruz
                }

            if (sayac == adet) {  // istenilen adet sayaca esit olursa for loop bitmeli. break kullaniyoruz
                break;
            }
            asalSayiMi = true;  // for loop dönerken asalsayi olmayan degerde boolean false olmustu.
            // devam icin tekrar true ceviriyoruz
            son++;  // son deger hic vermiyoruz. cunkuistenilen adet belki 5 belki 100.
            // sinir koymamak icin son degeri de for loop icinde bu sekilde arttirmis oluyoruz
        }
    }
}
