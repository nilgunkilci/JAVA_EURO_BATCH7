package days.day36_Review;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        // kullanicidan aldiginiz String i ters ceviren bir program yaziniz

        Scanner scn= new Scanner(System.in);
        System.out.println(" Lutfen bir kelime giriniz" );
        String  kelime= scn.nextLine();
        System.out.println("kelime = " + kelime);
        String reversed="";

        for (int i=kelime.length()-1; i>=0;i--){
            reversed+=kelime.charAt(i);

        }
        System.out.println("kelime = " + kelime);
        System.out.println("reversed = " + reversed);
    }
}
