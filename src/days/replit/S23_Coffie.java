package days.replit;

import java.util.Scanner;

public class S23_Coffie {
    public static void main(String[] args) {
        /*
        Tom's diner has three main drinks types, coffie, coke and juice and all of them have the same prices.

        if a cashier enters "coffie" or "coke " or "juice" he will get the same price a float : 4.0 $

        "soda" = 2.0 $

        Scanner scn = new Scanner(System.in);
        System.out.println("choice");
        String str = scn.next();

         */
        Scanner input = new Scanner(System.in);

        String str= input.nextLine();
        System.out.println(str);
        String str1="coffie";
        String str2="coke";
        String str3="juice";
        String str4="soda";
        if (str.equals("coffie") || str.equals("coke") || str.equals("juice")) {
            System.out.println(4.0);
        }else if (str.equals("soda")) {
            System.out.println(2.0);
        }

        }
    }

