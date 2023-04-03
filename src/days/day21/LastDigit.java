package days.day21;

public class LastDigit {
    public static void main(String[] args) {

        /*
        Given two non-negative int values,
        return true if they have the same last digit,
        such as with 27 and 57.
         Note that the % "mod" operator computes remainders,
         so 17 % 10 is 7.


        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true
        */

        int a = 6;
        int b = 16;
        int c = 25;
        boolean sonRakamAyni = true;

        if (a % 10 == b % 10 && b % 10 == c % 10) {
            System.out.println("son rakamlar " + sonRakamAyni);
        } else {
            System.out.println("son rakamlar " + !sonRakamAyni);
        }
        sonRakamAyni = (a % 10 == b % 10) ? true : false;
        System.out.println(sonRakamAyni);




    }
}
