package days.day10;

public class LogicalOperatorAND {
    public static void main(String[] args) {

        boolean b = (3 <= 7) & (5 >= 9);

        /*
        Expression1                 Expression2                 Result
        True                        True                        True
        True                        False                       False
        False                      True                        False
        False                       False                       False

         */

        System.out.println(true & true); // True
        System.out.println(true & false); // false
        System.out.println(false & true); // false
        System.out.println(false & false); //false


        int i1 = 15;
        int i2 = 10;
        double d1 = 20.5;
        double d2 = 15.7;
        System.out.println((i1 >= i2));
        System.out.println((d1 >= d2));


        // Tekli & Operator
        boolean res1 = (i1 >= i2) & (d1 >= d2); // T / T = T
        System.out.println("res1 = " + res1);

        boolean res2 = (i1 >= i2) & (d1 <= d2); // T / F = F
        System.out.println("res2 = " + res2);

        // Ciftli && Operator
        boolean res3 = (i1 >= i2) && (d1 >= d2); // T / T = T
        System.out.println("res3 = " + res3);

        boolean res4 = (i1 >= i2) && (d1 <= d2); // T / F = F
        System.out.println("res4 = " + res4);

        System.out.println(true && true);  // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // Tek operator ile cift operator arasindaki fark
        // Eger operantlardan biri false donuyor ise ikinci veya diger operantlati check etmeden sonucu donduruyor
        // Tamamen performance ile ilgili
        // Sonuc acisindan hic bir fark yok

    }


}
