package days.day9;

public class ÖdevAlistirmalar3 {
    public static void main(String[] args) {

        // ÖRNEK 1----> 2+12-6
        int sonuc;
        sonuc = 2 + 3 * 4 - 6;
        System.out.println(sonuc); // islem önceligi oldugu icin carpma ile baslanir.2+12-6
        // daha sonra islemler ayni düzeyde oldugu icin soldan saga compiler edilir.
        // sonuc integer bir deger cikar ve 8 dir.

        //___________________________________________________

        // ÖRNEK 2----> 14 / 7 * 2 + 30 / 5 + 1
                                                    /* islem önceligi oldugu icin carpma ve bölmeler yapilir.
                                                          2*2+6+1
                                                         4+6+1 =====> sonuc 11 olur.
                                                        int bir degere atama yapilabilir. */
        int sonuc2;
        sonuc2 = 14 / 7 * 2 + 30 / 5 + 1;
        System.out.println("sonuc2 = " + sonuc2);

        //--------------------------------------------------------------

        // ÖRNEK 3 ----> (12 + 3) / 4 * 2
                                            /*   islem önceliginden dolayi önce parantez ici ,
                                            sonra carpma ve bölmeler yapilir.*/
        int sonuc3;
        sonuc3 = (12 + 3) / 4 * 2;
        System.out.println("sonuc3 = " + sonuc3); // int atama yaptigimiz icin  sonuc 6 cikar.
        double sonuc33;
        sonuc33 = (12 + 3) / 4 * 2; // double type atama yaparsak 6.0 cikar. cunkü  bölme intger olarak hesaplaniyor.
        double sonuc33d;
        sonuc33d = (double) (12 + 3) / 4 * 2; // double casting yaparak atama yapsaydik sonuc 7.5 olur.
        System.out.println("sonuc33d = " + sonuc33d);

        //____________________________________________

        // ÖRNEK 4----> (238 % 10 + 3) % 7
                                             /*   islem önceliginden dolayi önce parantez ici ,
                                            sonra carpma ve bölmeler yapilir.*/

        int sonuc4;
        sonuc4 = (238 % 10 + 3) % 7;
        System.out.println("sonuc4 = " + sonuc4); // (10+3)%7 -->  11%7 --->  sonuc 4 cikar.

        //________________________________________________

        // ÖRNEK 5----> (18 - 7) * (43 % 10)

        // islem önceligine dikkat et.

        int sonuc5;
        sonuc5 = (18 - 7) * (43 % 10);
        System.out.println("sonuc5 = " + sonuc5); // 11*3 --> sonuc 14 olur

        //______________________________________________________

        // ÖRNEK 6---->  2 + 19 % 5 - (11 * (5 / 2))
        // islem önceligine dikkat et.

        int sonuc6;
        sonuc6 = 2 + 19 % 5 - (11 * (5 / 2));
        System.out.println("sonuc6 = " + sonuc6); // 2+4-(11*2) --> 6-22 --> sonuc -16 cikar.

        // parantez ici bölmede double casting yaparsak, double atama yapmaliyiz.
        double sonuc6d;
        sonuc6d = 2 + 19 % 5 - (11 * ((double) 5 / 2)); // 2+4-(11+2.5) --> 6-27.5 --> sonuc -21.5
        System.out.println("sonuc6d = " + sonuc6d);

        //__________________________________________________

        // ÖRNEK 7 ----> 813 % 100 / 3 + 2.4
        // islem önceline dikkat.
        double sonuc7;
        sonuc7 = 813 % 100 / 3 + 2.4;  // double type atama yaptim. cünkü islem icerisinde double sayi mevcut.
        System.out.println("sonuc7 = " + sonuc7); // 13/3+2.4 --> 4+2,4 --> sonuc 6.4 cikar
                                                /* buraya dikkat ; compiler yparken soldan saga islem yapiliyor.
                                                   ve 13/3 ün sonucu int deger cikar.
                                                   cünkü 13 ve 3 int degerlerdi. java bundan dolayi önce int hesapliyor.
                                                   doubele yani 2.4 e geldiginde double hesaplama yapiyor*/

        // egerki 813 öncesinde double casting yapsaydik.
        double sonuc77 = (double) 813 % 100 / 3 + 2.4;
        System.out.println("sonuc77 = " + sonuc77);  // 13/3+2.4 --> 4-3333 v+2,4 --> sonuc 6.7333333 cikar

        //______________________________

        // ÖRNEK 8 ----> 26 % 10 % 4 * 3

        int sonuc8;
        sonuc8 = 26 % 10 % 4 * 3;
        System.out.println("sonuc8 = " + sonuc8); // 6%4*3 --> 2*3 --> sonuc 6 cikar.

        //___________________________________

        // ÖRNEK 9 ----> 22 + 4 * 2

        int sonuc9 = 22 + 4 * 2;
        System.out.println("sonuc9 = " + sonuc9); // 22+8 -->  sonuc 30

        //_________________________________________________

        // ÖRNEK 10 ----> 23 % 8 % 3

        int sonuc10 = 23 % 8 % 3;
        System.out.println("sonuc10 = " + sonuc10); // 7%3 --> sonuc 1

        //________________________________________________________________

        // ÖRNEK 11 ----> 12 - 2 - 3

        int sonuc11 = 12 - 2 - 3;
        System.out.println("sonuc11 = " + sonuc11); // 10-3 --> sonuc 7

        //_____________________________________________________________

        // ÖRNEK 12 ----> 6/2 + 7/3

        int sonuc12 = 6 / 2 + 7 / 3;
        System.out.println("sonuc12 = " + sonuc12); /* 3+2 --> 5
                                                    burada 7/3 int sayilar oldugu icin
                                                     java islemi int olarak yapiyor.*/

        // egerki atamayi double ve  7 yi double casting yaparsak,  3+2.3333 --> sonuc 5.3333
        double sonuc1212 = 6 / 2 + (double) 7 / 3;
        System.out.println("sonuc1212 = " + sonuc1212);

        //______________________________________________________

        // ÖRNEK 13 ----> 6 * 7 % 4

        int sonuc13 = 6 * 7 % 4;
        System.out.println("sonuc13 = " + sonuc13); // 42%4 --> sonuc 2

        //________________________________________________________

        // ÖRNEK 14 ----> 3 * 4 + 2 * 3

        int sonuc14 = 3 * 4 + 2 * 3;
        System.out.println("sonuc14 = " + sonuc14); // 12+6 --> sonuc 18

        //___________________________________________________________

        // ÖRNEK 15 ----> 177 % 100 % 10 / 2

        int sonuc15 = 177 % 100 % 10 / 2;
        System.out.println("sonuc15 = " + sonuc15); // 77%10/2 --> 7/2 -->  sonuc 1

        //___________________________________________________________________

        // ÖRNEK 16 ----> 89 % (5 + 5) % 5

        int sonuc16 = 89 % (5 + 5) % 5;
        System.out.println("sonuc16 = " + sonuc16); // 89%10%5 --> 9%5 --> sonuc 4

        //______________________________________________________________________

        // ÖRNEK 17 ----> 392 / 10 % 10 / 2

        int sonuc17 = 392 / 10 % 10 / 2;
        System.out.println("sonuc17 = " + sonuc17); // 39%10/2 --> 9/2 -->  sonuc 4


        // double type atama yaparsak ve casting yaparsak
        double sonuc1717= (double)392 / 10 % 10 / 2;
        System.out.println("sonuc1717 = " + sonuc1717);
        double d=39.2%10;
        System.out.println("d = " + d);


        //_____________________________________________________________________


        // ÖRNEK 18 ----> 8 * 2 - 7 / 4

        int sonuc18 = 8 * 2 - 7 / 4;
        System.out.println("sonuc18 = " + sonuc18); // 16-1 --> sonuc 15

        // double atama ve double casting yaparsak
        double sonuc1818 = 8 * 2 - (double) 7 / 4;
        System.out.println("sonuc1818 = " + sonuc1818); // 16-1.75 -->  sonuc 14.25

        //___________________________________________________________________

        // ÖRNEK 19 ----> 37 % 20 % 3 * 4

        int sonuc19 = 37 % 20 % 3 * 4;
        System.out.println("sonuc19 = " + sonuc19); // 17%3*4 --> 2*4 --> sonuc 8

        //______________________________________________________________________


        // ÖRNEK 20 ----> 17 % 10 / 4
        int sonuc20 = 17 % 10 / 4;
        System.out.println("sonuc20 = " + sonuc20); // 7/4 --> sonuc 1

        // double atama ve souble casting  olursa
        double sonuc2020=17 % (double)10 / 4;
        System.out.println("sonuc2020 = " + sonuc2020); // 7.0/4 --> sonuc 1.75


    }
}
