package days.day30;

import java.util.Scanner;

public class NextNextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir veri giriniz");
        String veri= input.next ();             // next methodu siniri space karakterine kadar. bundan dolayi tek kelime alabilir.
        System.out.println("veri = " + veri);


        Scanner input2 = new Scanner(System.in);
        System.out.println("Lutfen bir veri daha giriniz");
        String veri2=input2.nextLine ();        // nextLine methodu ile cumleler seklinde veri alinabilir
        System.out.println("veri2 = " + veri2);

        // next ve nextLine metohdlarini  ayni obje de kullandigimizda
        // ilk once next sonra nextLine olunca hata veriyor. bunun icin cozum ayni objede kullanacak isek
        // hepsi ya next ya da nextLine methodu olmali
        // diger bir cozum hepsi icin ayri ayri obje olusturmak

    }
}
