package days.day31_StringClass;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str1 = sc.nextLine();

        System.out.println("Lutfen ikinci bir String giriniz");
        String str2 = sc.nextLine();

        System.out.println("Stringler esittir = " + compareStrings(str1,str2));
    }

    public static boolean compareStrings(String str1, String str2){
        System.out.println("str1 = " + str1.length());
        System.out.println("str2 = " + str2.length());
        return str1.length() == str2.length();

    }

}
