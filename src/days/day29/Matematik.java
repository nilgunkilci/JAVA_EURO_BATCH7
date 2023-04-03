package days.day29;

public class Matematik {
    // toplama  - carpma - cikarma - bölme -------->  double
    // bir sayinin karesini almak icin bir method ---> 1 paremetreli int olsun ----> return int
    // iki sayidan buyuk - kücük olani dondurelim ---> iki int return type int.

    public static void main(String[] args) {
        Matematik islem = new Matematik();
        islem.toplama(10, 20);
        Matematik operation = new Matematik();
        operation.toplama(40, 50);
        double toplama2 = operation.toplama(40, 50);
        System.out.println("toplama2 = " + toplama2);
        double carpma = islem.carpma(5, 10);
        System.out.println("carpma = " + carpma);
        System.out.println("carpma = " + (islem.carpma(20, 45)));

        double karesi = islem.karesi(40);
        System.out.println("karesi = " + karesi);
        islem.karesi(2,3);
    }

    public double toplama(int a, int b) {
        double toplama = a + b;
        System.out.println("toplama = " + toplama);
        return toplama;

    }

    public double carpma(int a, int b) {
        return a * b;

    }

    public double karesi(int a) {
        double karesi = a * a;
        System.out.println("karesi = " + karesi);
        return karesi;
    }
    public double karesi(int sayi,int ussu){
        double sonuc=sayi;
        for (int i=1;i<ussu;i++){
            sonuc = sonuc * sayi ;
        }
        System.out.println("sonuc = " + sonuc);
        return sonuc;
    }
}
