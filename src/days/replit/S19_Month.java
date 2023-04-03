package days.replit;

import java.util.Scanner;

public class S19_Month {

    public static void main(String[] args) {
     /*
        Write a program that will print out ** month name ** by receiving a number.
        Use if condition
      */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter month number :");
        int monthNum = input.nextInt();


        if(monthNum==1){
            System.out.println("Ocak");}
        else if(monthNum==2){
            System.out.println("Subat");}
        else if(monthNum==3){
            System.out.println("Mart");}
        else if(monthNum==4){
            System.out.println("Nisan");}
        else if(monthNum==5){
            System.out.println("Mayis");}
        else if(monthNum==6){
            System.out.println("Haziran");}
        else if(monthNum==7){
            System.out.println("Temmuz");}
        else if(monthNum==8){
            System.out.println("Agustos");}
        else if(monthNum==9){
            System.out.println("Eylul");}
        else if(monthNum==10){
            System.out.println("Ekim");}
        else if(monthNum==11){
            System.out.println("Kasim");}
        else if(monthNum==12){
            System.out.println("Aralik");}
        else if(monthNum==0){
            System.out.println("No such month");}

    }





}
