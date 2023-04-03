package days.day31_StringClass;

public class StringClass {
    public static void main(String[] args) {


        // String Java da hazir bulunan classlardan biridir.
        // lang package icinde bulunur. ve bundan dolayi import edilmeye gerek yoktur.
        // String class,Char dizilimine sahip objeler olusturmaya yarar. Bu objeler 2 türlü olusturulur.

        // 1. yöntem String Literal ile object  create etmek.
        // Bu yöntem ile olusturulan object ler Heap memory de STRING POOL icinde depo edilir.
        // String pool . veriyi önce kontrol eder. pool icinde yoksa veriyi depo eder.
        // pool icinde önceden kayitli ise object nin adresini buraya isaret eder.
        // bu hafizayi gereksiz kullanimini engellemis olur.
        String str= "Hello";
        System.out.println("str = " + str);

        // 2. yöntem new keyword ile object create  etmek.
        // Bu yontem ile olusturulan her object Heap memory de ayri bir adresde store edilir.
        String strr= new String("Hello");
        System.out.println("strr = " + strr);


        String str1 = new String("EuroStudy");
        String str2 = "EuroStudy";
        String str3 = "EuroStudy";
        String str4 = new String("EuroStudy");

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false
        System.out.println(str2==str3); // true
        System.out.println(str2==str4); // false
        System.out.println(str3==str4); // false
        System.out.println(str1.equals(str2)); // sadece icerigin esitlik kontrolu yapildigi icin sonuc true doner.


    }
}
