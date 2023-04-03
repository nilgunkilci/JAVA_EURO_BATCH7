package days.day39_WapperClass.nlgn;

public class N_AutoUndUnboxing {
    public static void main(String[] args) {

        // AUTO BOXING

        // Wrapper object olusturmak icin kolay bir yontem. java otomatik kendi yapiyor. new Keyword e gerek kalmiyor.

        // 1---
        int i =123;
        Integer i1= i;

        // 2--
        Integer i3= 123;

        System.out.println("i1 = " + i1);
        System.out.println("i3 = " + i3);

        // UNBOXING
        // Wrapper class da olusan bir objeyi , primitive data turune donusturme otomatik olarak yapilir.
        // intValue() , doubleValue() gibi methodlara gerek yok.

        // 1-- once wrapper object , sonra primitive
        Integer sayi = new Integer(567);
        int sayi1= sayi;
        // ya da
        Integer sayi2= Integer.valueOf("88");
        int sayi3= sayi2;

        // 2-- ayni satirda primitive degiskene, object i atama
        double d= new Double("23.4");



    }
}
