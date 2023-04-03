package days.day68_Review;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alarak asal sayi olup olmadigini kontrol edeiniz

        Scanner sc = new Scanner(System.in);
        System.out.println(" Lütfen bir sayi giriniz");
        int num = sc.nextInt();

        primeNumber(num);
    }
    public static void primeNumber(int num) {

        int sayac = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { //eger sayi tam bölünüyorsa asal sayi degildir ve break ile döngüden cikilir.
                sayac++;        // eger sayi tam bölündüyse sayc degisir ve asal olup olmadigini belrlemis oluruz.
                break;
            }
            i++;
        }
        if (sayac == 0) {

            System.out.println(" Girdiginiz " + num + " saiysi bir asal sayidir.");
        } else
            System.out.println("Girdiginiz " + num + " saiysi bir asal sayi degildir.");
    }

}
