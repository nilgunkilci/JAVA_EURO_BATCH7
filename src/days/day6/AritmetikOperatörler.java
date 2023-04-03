package days.day6;

public class AritmetikOperatörler {
    public static void main(String[] args) {

        // toplama +
        System.out.println(5 + 5);
        int a = 10;
        int b = 20;
        int sonuc = a + b;
        System.out.println("sonuc = " + sonuc);
        double d = 10.20;
        double v = d + a;
        // int + int ---->  int
        // int + double ----> double
        double d1 = a + b;
        System.out.println("d1 = " + d1);  // sonuc 30.0 cikar. cünkü double
        boolean b1 = true;
        // boolean karakter ile toplama olmaz
        char c = 'a';
        char b3 = 'b';
        int i = c + b3;
        System.out.println("i = " + i);
        String ab = "c" + "b3";
        System.out.println(ab); // cb3 cikar ama biz bunu istemiyoruz.
        String ab2 = "" + c + b3;
        System.out.println(ab2);


    }
}
