package days.day68_Review;

import java.util.Random;
import java.util.Scanner;

public class DiceSum {
    public static void main(String[] args) {

        // Kullanicidan 1 ile 12 arasinda bir sayi aliniz,
        // Daha sonra iki zar atarak kullanicinin soyledigi rakama
        // kac zar atisi ile ulastigimizi tespit eden bir method yaziniz

        System.out.println("Please give me a number between 2 nd 12!");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        System.out.println("You have found the number after " + diceSum(sum) + " attempt");

    }

    public static int diceSum(int sum){
        Random r1 = new Random();
        Random r2 = new Random();
        int zar1;
        int zar2;
        int counter = 0;

        if(sum >1 && sum <=12){
            do {                    // Burada do While döngüsü kullandik. cunku once zarlari attiktan sonra kontrol döngüsüne giriyoruz.
                zar1 = r1.nextInt(1, 7);
                zar2 = r2.nextInt(1, 7);
                System.out.println(zar1 + " and " + zar2 + " = " + (zar1 + zar2));
                counter++;
            }while(sum != zar1+zar2);

        }else{
            System.out.println("Number you have choosen is out of range");
        }
        return counter;
    }
}
