package days.day30;

import java.util.Scanner;

public class SayilarinToplami {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen  1. sayi giriniz");
        // ard arda sayilari enter tusu ya da space tusu ile de kullanicidan sayilar alinabilir

        double sayi1= sc.nextDouble();
        System.out.println("Lutfen  2. sayi giriniz");
        double sayi2= sc.nextDouble();
        System.out.println("Lutfen  3. sayi giriniz");
        double sayi3= sc.nextDouble();
        double toplamSayi= sayi1+sayi2+sayi3;
        System.out.println("toplamSayi = " + toplamSayi);

    }
}
