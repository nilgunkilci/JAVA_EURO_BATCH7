package days.day30;


import java.util.Scanner;

public class UserInput {

    // Java library de önceden hazirlanmis package, class ve methodlar var.
    // lang, util ve net  bu packeagelerden bazilari
    // lang disindaki tüm package larin kullanilabilmesi icin import edilmeleri gerekir.
    // Kullanicidan alinan bilginin okunabilmesi icin Scanner class kullanilir.
    public static void main(String[] args) {

        // 1-- Oncelikle Scanner class import edilmeli. import islemi classimizin disinda olusturulur. ama IDE bunu otomatik yapar.
        // 2--ikinci olarak Scanner objekt i create et.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");  // Kullanicidan alinmak istenilen bilgi hakkinda  mesaj


        //System.out.println(input);  // olusturulan objenin sadece adresini veriyor
        // 3--ucuncu olarak girdi  yi kullanabilmek icin data tipine uygun method cagrilir.

        int girdi= input.nextInt();
         // Artik kullanicinin girdigi bilgi kullanilabilir.

        System.out.println("girdi = " + girdi);

    }
}
