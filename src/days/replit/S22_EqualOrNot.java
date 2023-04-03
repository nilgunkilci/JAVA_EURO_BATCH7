package days.replit;

import java.util.Scanner;

public class S22_EqualOrNot {
    public static void main(String[] args) {
        /*
        Declare 2 variable named num1 and num2,

        Using Multi-Branch if statements, compare num1 and num2.

        Example
        Display message: Enter 2 numbers:
        input 15 15
        output : 15 & 15 are equal
        Display message: Enter 2 numbers:
        input 57 75
        output : 57 less than 75
        Display message: Enter 2 numbers:
        imput : 999 99
        output : 999 greater than 99
         */

        // DO NOT CHANGE:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        if (num1==num2){
            System.out.println(num1 +" & " + num2 +"  are equal");
        }else if (num1>num2){
            System.out.println( num1 + " greater than " + num2);
        } else if (num1<num2) {
            System.out.println(num1 + " less than " + num2);
        }

    }
}
