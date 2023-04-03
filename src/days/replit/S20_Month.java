package days.replit;

import java.util.Scanner;

public class S20_Month {
    public static void main(String[] args) {

        /*
        Write a program that will print out ** month name ** by receiving a number.
        Use swich case
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number :");
        int monthNum = input.nextInt();
        String ay= "";
        switch (monthNum){
            case 1:
                ay="January";
                break;
            case 2:
                ay="February";
                break;
            case 3:
                ay="March";
                break;
            case 4:
                ay="April";
                break;
            case 5:
                ay="May";
                break;
            case 6:
                ay="June";
                break;
            case 7:
                ay="July";
                break;
            case 8:
                ay="August";
                break;
            case 9:
                ay="September";
                break;
            case 10:
                ay="October";
                break;
            case 11:
                ay="November";
                break;
            case 12:
                ay="December";
                break;
            default: ay="No such month";
        }
        System.out.println(ay);
    }
}
