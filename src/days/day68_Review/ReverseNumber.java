package days.day68_Review;

import java.util.Scanner;

public class ReverseNumber {


    public static void main(String[] args) {

        // Kullanicidan birden fazla basamakli sayi alarak
        // bu sayiyi ters ceviren bir method olusturun

        System.out.println(" Lütfen birden fazla basamaga sahip bir sayi giriniz");
        Scanner scn = new Scanner(System.in);
        int sayi = scn.nextInt();
        System.out.println("sayi = " + sayi);
        System.out.println(reverseNumber(sayi));

    }

    public static int reverseNumber(int sayi) {
        int reversed = 0;
        while (sayi != 0) {
            int digit = sayi % 10;  // burada sayinin son rakamini aliyoruz

            reversed = reversed*10 + digit;     // ters cevrilmis sayiyi olusturmaya basliyoruz.
            sayi = sayi/10;   // sayimizi son basamaktan kurtariyoruz

        }
        return reversed;
    }
}
