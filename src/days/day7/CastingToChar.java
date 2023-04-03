package days.day7;

public class CastingToChar {

    public static void main(String[] args) {

        char ch;
        int num = 65;
        ch = (char) num; // Expilicit casting
        System.out.println("char deger = " + ch);

        int num2 = ch;  // Impilicit casting
        System.out.println("int deger = " + num2);

        boolean bl = true;
        //  int i=(int) bl; bunu kabul etmiyor.
        // Cünkü Boolean can not be casted to any primitive




    }
}
