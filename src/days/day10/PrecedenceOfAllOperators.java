package days.day10;

public class PrecedenceOfAllOperators {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 30;
        int num3 = 40;

        boolean result = num1 < num2 || num3 > num1; // Relational-> Logical -> Assignment
        System.out.println("result = " + result); // T||T --> T

        System.out.println("----------------------------");
        String havaDurumu;
        int derece;
        havaDurumu = "Günesli";
        derece = 25;

        boolean disariCikilirMi = havaDurumu == "Günesli " || derece >= 20;
        System.out.println("disariCikilirMi = " + disariCikilirMi);


        System.out.println("----------------------------");

        int num = 3;
        boolean sum;
        sum = --num == 3 || ++num == 2 && --num == 2;  //
        System.out.println("sum = " + sum);

    }
}
