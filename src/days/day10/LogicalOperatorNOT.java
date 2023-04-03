package days.day10;

public class LogicalOperatorNOT {
    public static void main(String[] args) {
        boolean b = 3 == 5; // 3 rakami 5 rakamina esitmi? cevap: hayir
        boolean b2 = 3 != 5; // 3 rakami 5 rakamina esit degil mi? cevap: evet

        System.out.println("b = " + b);
        System.out.println("b2 = " + b2);

        /*
        Sonucu dogrudan tersine cevirir
         */

        int i1 = 15;
        int i2 = 10;
        double d1 = 20.5;
        double d2 = 15.9;

        boolean res1 = (i1 >= i2) && (d1 != d2); // T / T = T
        System.out.println("res1 = " + res1);

        boolean res2 = (i1 >= i2) && !(d1 >= d2); // T / F = F
        System.out.println("res2 = " + res2);

        // ! Not operatoru
        // Bir boolean sonucunu dogrudan degistirmeye yarar
        // adeta math deki (-) isareti fonksiyonu gorur
        // Condition degerini tersine cevirir
        // -(-) = +    -(+) = -

        boolean success = true;
        System.out.println("success = " + success); // true
        System.out.println("success = " + !success); // false
    }
}
