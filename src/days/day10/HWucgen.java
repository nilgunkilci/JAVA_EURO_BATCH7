package days.day10;

public class HWucgen {

    public static void main(String[] args) {

       /* Odev2: Verilen 3 tane acidan bir ucgen olusturulup olusturlamayacagini check eden bir program yazınız
        Kural 1: Ucgenin ic acilarinin toplami 180 e esit olmalidir
        Kural 2: Herhangi bir acı 1 den kucuk veya 180 e esit olamaz*/

        // ücgenin cizilmesi icin 3 sart var. bu sartalarin hepsi gerceklesirse ücgen cizilebilir. bundan dolayi AND && operator kullandim.
        // 1. sart (a1 + a2 + a3) == 180
        // 2. sart (a1 != 180 && a2 != 180 && a3 != 180)
        // 3. sart (a1 >= 1 && a2 >= 1 && a3 >= 1)

        int a1 = 13;
        int a2 = 27;
        int a3 = 140;
        int acilarToplami = a1 + a2 + a3;
        boolean ücgen = ((a1 + a2 + a3) == 180) && (a1 != 180 && a2 != 180 && a3 != 180) && (a1 >= 1 && a2 >= 1 &&
                a3 >= 1);

        System.out.println("ücgeni cizebilir miyim? = " + ücgen);// true cikarsa cizilebilir. false cikarsa cizilemez.



    }
}
