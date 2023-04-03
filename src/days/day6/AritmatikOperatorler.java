package days.day6;

public class AritmatikOperatorler {
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = b - a;
        System.out.println(c);
        double d = 30.50;
        System.out.println(d - a);
        System.out.println(a - d);

        int c1 = a * b;
        System.out.println("c1 = " + c1);   // sonuc 600 olur
        int i = a * b * c;
        System.out.println("i = " + i);   // sonuc 6000 olur
        System.out.println(i / b);  // sonuc 200 olur

        int hesaplama = 18 + 9 * 6;
        System.out.println("hesaplama = " + hesaplama);   // sonuc 72 olur

    }
}
