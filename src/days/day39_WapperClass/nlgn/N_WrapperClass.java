package days.day39_WapperClass.nlgn;

public class N_WrapperClass {
    public static void main(String[] args) {

        // Primitive data type lar bir obje degiller ve steak memory de store edilir.
        // Genellikle Class lar object ler ile calistigi icin , primitive data type lar islevsel kullanilamaz.
        // Wrapper Class lar , primitive data type lari objelere cevirerek , Class larda islevsel kullanimini saglar.
        // Her primitive data type kendi turunde object ye donusturulur.
        /*
        PRIMITIVE DATA TYPE                     WRAPPER CLASSES
        boolean                                 Boolean
        char  **                                Character **
        byte                                    Byte
        short                                   Short
        int **                                  Integer **
        long                                    Long
        float                                   Float
        double                                  Double


         */
        // Wrapper Classes java.lang package de bulundugu icin import edilmezler.


        // WRAPPER CLASS LARDAN OBJECT CREAT ETME

         // 1-- new Keyword ile .parametre olarak hem direk sayi girilebilir hem de cift tirnak ile sayi girilebilir
         int sayiu= 78;


         Integer sayi = new Integer(12);
        System.out.println("sayi = " + sayi);
        Integer sayi2 = new Integer("344");
        System.out.println("sayi2 = " + sayi2);
        Integer sayi3= new Integer(10);
        System.out.println("sayi+sayi2 = " + sayi+sayi2); // matematiksel islem yapilamiyor .
        System.out.println("sayi+sayi3 = " + sayi + sayi3);

        // 2--ValueOf() method u ile

        Integer sayi4 =Integer.valueOf(123);
        Integer sayi5 = Integer.valueOf("4");
        System.out.println("sayi4 = " + sayi4);
        System.out.println("sayi5 = " + sayi5);
        System.out.println("sayi5, sayi2 ' ye esit midir? = " + (sayi5 == sayi2));
        System.out.println("sayi5, sayi2 ' ye esit midir? (equals method ile) = " + sayi5.equals(sayi2));
        // Wrapper class lar object olusturuldugu icin her biri Heap memory de ayri adreslerde store edilir.

        // Not: char Wrapper object olustururken Tek tirnak kullanilmali.

        Character harf= new Character('k');
        Character harf1 = Character.valueOf('a');



    }
}
