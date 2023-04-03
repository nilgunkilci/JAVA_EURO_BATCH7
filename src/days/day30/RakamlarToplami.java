package days.day30;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen 1 den 99 a kadar olan bir sayi giriniz");
        int sayi = input.nextInt();
        rakamlarToplami( sayi);

    }

    public static void rakamlarToplami(int sayi) {


        int top = 0;
        if (sayi<999){
            for (int i = 0; i < 3; i++) {
                top  += sayi % 10;
                sayi /=10;

            }
        }System.out.println("top = " + top);


    }
}
