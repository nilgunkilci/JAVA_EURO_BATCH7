package days.replit;

import java.util.Scanner;

public class S18_SchoolAge {
    public static void main(String[] args) {

        /*
        School System are classified by age as follows:
        6-7-> young reader,
        8-10-> elementary,
        11 and 12-> middle,
        13-> impossible,
        14-16-> high school
        17-18-> scholar
        less than 6 and greater than 18, ineligible

        example :
        input : 7 output : young reader
        input : 10 output : elementary
        input : 11 output : middle
        input : 13 output : impossible
        input : 16 output : high school
        input : 17 output : scholar
        input : 1 output : ineligible
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        if (age == 6|| age == 7) {
            System.out.println("young reader");
        } else if (age >= 8 && age <= 10) {
            System.out.println("elementary");

        } else if (age == 11 || age == 12) {
            System.out.println("middler");

        } else if (age == 13) {
            System.out.println("Immpossible");

        } else if (age >= 14 && age <= 16) {
            System.out.println("High School");

        } else if (age == 18 || age == 17) {
            System.out.println("scholar");
        }else {
            System.out.println("ineligible");
        }


    }
}
