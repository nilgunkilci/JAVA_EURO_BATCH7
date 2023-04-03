package days.day35_Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        // Array deki elemanlari ters cevirin

        int [] sayilar = { 23,67,45,32,98,54};
        int sayi=0;
        int[] newSayilar= new int[sayilar.length];
        for (int i = sayilar.length-1; i >= 0; i--) {

              newSayilar[sayi]=sayilar[i];
              sayi++;

        }
        System.out.println("Arrays.toString(newSayilar) = " + Arrays.toString(newSayilar));

    }
}
