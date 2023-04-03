package days.day31_StringClass;

import java.util.Scanner;

public class SonKarakter {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
        String str=input.nextLine();

        sonKarakter(str);

    }
    public static void sonKarakter(String str){
        System.out.println(str.charAt(str.length() - 1));

    }
}
