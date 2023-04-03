package days.Method;

public class C3_OverLoading {
    public static void main(String[] args) {
        int a = 5;
        int b = 60;
        toplama(a, 5, 55);
        toplama(b, a);
        toplama(a, 34, b);
        toplama(2.3,4.5,5.5);
        toplama("yaz",20);
        toplama("yaz","kis");

        // Ayni isimde methodlar olusturulabilir.
        // bunu yaparken parametre sayilarini ya da type lari degistirmeliyiz
        // Public , static ve void in degistirilmesi ile YAPILAMAZ.

    }

    public static void toplama(int a, int b) {

        int toplam = a + b;
        System.out.println("toplam1 = " + toplam);
    }

    public static void toplama(int a, int b, int c) {  // parametre sayisi farkli olunca ayni isimde method olusturulabilir

        int toplam = a + b + c;
        System.out.println("toplam2 = " + toplam);
    }

    public static void toplama(double a, double b, double c) { // parametrelerin type lari farkli olunca
        // ayni isimde method olusturulabilir

        double toplam = a + b + c;
        System.out.println("toplam3 = " + toplam);
    }

    public static void toplama(String a, int b) {
        System.out.println("toplam4 = " + a + b);

    }

    public static void toplama(String a, String b) {
        System.out.println("toplam5 = " + a + b);
    }
}

