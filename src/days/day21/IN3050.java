package days.day21;

import java.util.Scanner;

public class IN3050 {
    public static void main(String[] args) {


        //Given 2 int values,
        // return true if they are both in the range 30..40 inclusive,
        // or they are both in the range 40..50 inclusive.


        //in3050(30, 31) → true
        //in3050(30, 41) → false
        //in3050(40, 50) → true

        int a = 30;
        int b = 31;

        if ((a > 30 && a < 40) || (a > 40 && a < 50) && (b > 30 && b < 40) || (b > 40 && b < 50)) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Adinizi Giriniz");
        String kullaniciAdi=scan.next();
        System.out.println(kullaniciAdi.toUpperCase());

    }
}
