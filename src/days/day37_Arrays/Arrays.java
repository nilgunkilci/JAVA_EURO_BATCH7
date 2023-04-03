package days.day37_Arrays;

public class Arrays {
    public static void main(String[] args) {

        int numara = 50;
        int [] numaralar= new int [5];
        numaralar[0]=10;
        numaralar[1]=numara;
        numaralar[2]= 30;
        numaralar[3]= 40;
        numaralar[4]= 100;

        System.out.println("numaralar[0] = " + numaralar[0]);
        System.out.println("numaralar[4] = " + numaralar[4]);
        System.out.println("numaralar.length = " + numaralar.length);
        System.out.println("numaralar[numaralar.length-1] = " + numaralar[numaralar.length - 1]); // length -1 , array in son dizisini verir.


        int  aliSinavSonuclari[]= {90,80,70,80,100};


                // mat  fizik   edebiyat    kimya   fransizca
        // ali      90  80      70          80          100
        System.out.println("aliSinavSonuclari.length = " + aliSinavSonuclari.length);
        System.out.println("aliSinavSonuclari[0] = " + aliSinavSonuclari[0]);
        System.out.println("aliSinavSonuclari[0] = " + aliSinavSonuclari[1]);
        System.out.println("aliSinavSonuclari[0] = " + aliSinavSonuclari[2]);
        System.out.println("aliSinavSonuclari[0] = " + aliSinavSonuclari[3]);
        System.out.println("aliSinavSonuclari[0] = " + aliSinavSonuclari[4]);

        // tum elementleri for dongusu ile de yazdirabiuliriz

        for( int i= 0; i<aliSinavSonuclari.length;i++){
            System.out.println("aliSinavSonuclari = " + aliSinavSonuclari[i]);
        }

        // tum elementleri for each ile de yazdirabiliriz.

        for (int sonuc: aliSinavSonuclari) {
            System.out.println("sonuc = " + sonuc);
        }


        //           mat  fizik   edebiyat    kimya   fransizca
        // ali      90      80        70         80      100
        // veli     80     100        90         85      90
        // ayse     85      90        100        90      95

        int[]velininNotlari={80,90,100,90,95};
        int []sinavSonuclari[] ={
                {90,80,70,80,100},
                {80,100,90,85,90},  //  tek bir array icinde 3 array ekledik
                {85,90,100,90,95}
        };
        System.out.println("sinavSonuclari = " + sinavSonuclari[0][1]);
        System.out.println("java.util.Arrays.toString(velininNotlari) = " + java.util.Arrays.toString(velininNotlari));


    }
}
