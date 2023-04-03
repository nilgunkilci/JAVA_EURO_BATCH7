package days.replit;

import java.util.Scanner;

public class S21_Weekdays {
    public static void main(String[] args) {
        /*Write a program that will print a week day according to the day number.

        The user shold input a number from 1 to 7 to select a day.

        The output should be the name of the day corresponding to the number

         */

        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter Number");
        int  day= scn.nextInt();
        String sonuc="";

        switch (day){
            case 1:
                sonuc="Heute is Montag";
                break;
            case 2:
                sonuc="Heute is Dienstag";
                break;
            case 3:
                sonuc="Heute is Mittwoch";
                break;
            case 4:
                sonuc="Heute is Donnerstag";
                break;
            case 5:
                sonuc="Heute is Freitag";
                break;
            case 6:
                sonuc="Heute is Samstag";
                break;
            case 7:
            sonuc="Heute is Sonntag";
            break;
            default:
                sonuc="Lütfen 1 ile 7 arasinda bir sayi giriniz";


        }
        System.out.println(sonuc);
    }
}
