package days.day35_Arrays;

import java.util.Arrays;

public class Arrays7 {
    public static void main(String[] args) {
        int[] sayilar = {5, 10, 3, 7, 22, 19, 38, 150};
        System.out.println("sayilar[0] = " + sayilar[0]);
        Arrays.toString(sayilar);// arrayli stringe ceviriyor
        Arrays.sort(sayilar);//kucukten buyuge dogru sirala
        System.out.println("sayilar[0] = " + sayilar[0]);
        String str = "Merhaba";//immutable degistirilemez
        System.out.println(str.concat(" Java"));//Merhaba Java
        System.out.println("str = " + str);//Merhaba
        System.out.println("Arrays.toString(sayilar) = " + Arrays.toString(sayilar));
        System.out.println("binarySearch(sayilar,10) = " + Arrays.binarySearch(sayilar, 10));// indeks noyu veriyor
        System.out.println("Arrays.stream(sayilar).sum() = " + Arrays.stream(sayilar).sum());// elementlerin toplamini verir
        int[] sayilar2 = {1, 2, 3, 5};
        int[] sayilar3 = {1, 2, 3, 5};
        System.out.println("Arrays.equals(sayilar2,sayilar) = " + Arrays.equals(sayilar2, sayilar3));
        System.out.println(Arrays.binarySearch(sayilar, 1)); // dizi icerisinde yoksa -1 döndürür.
        Arrays.stream(sayilar2).forEach(System.out::print);
        System.out.println();
          Arrays.stream(sayilar3).forEach(System.out::print);
         System.out.println();
        Arrays.stream(sayilar).filter(x -> x > 30).forEach(System.out::println);//filtreleme icin
        System.out.println();
        Arrays.stream(sayilar2).map(n -> n * 10).forEach(System.out::println);// her bir elemani verilen sayi ile carpiyoruz.

        Arrays.stream(sayilar2).filter(x-> x>4).forEach(System.out::print);

    }


}
