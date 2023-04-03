package days.day34_Arrays;

import java.util.Scanner;

public class Aylar {
    public static void main(String[] args) {

        // Yilin aylarini gosteren bir array olusturun.
        // ayni zamanda kullanicidan aldiiniz dogdugu ayi dogru bi sekilde yazdirin

        System.out.println(" Lutfen kacinci ayda dogdugunuzu giriniz");
        Scanner input = new Scanner(System.in);
        int ay = input.nextInt();




        String [] aylar=new String[12];
        aylar[0]="Ocak";
        aylar[1]="Subat";
        aylar[2]="Mart";
        aylar[3]="Nisan";
        aylar[4]="Mayis";
        aylar[5]="Haziran";
        aylar[6]="Temmuz";
        aylar[7]="Agustos";
        aylar[8]="Eylul";
        aylar[9]="Ekim";
        aylar[10]="Kasim";
        aylar[11]="Aralik";
        System.out.println("ay = " + aylar[ay-1]);


    }
}
