package days.day9;

public class Ornekler2 {
    public static void main(String[] args) {
        int max;
        int min = 10;
        max = 17 - 4 / 10;
        max = max + 6;
        min = max - min;
        System.out.println(max * 2);
        System.out.println(max + min);
        System.out.println(max);
        System.out.println(min);

        int a, b, c;
        a = b = c = 5;
        int exp = a + b++ + ++c;
        System.out.println("exp = " + exp);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println(7 + 2 + "(int) 2.0" + 2 * 2 + 2);


    }
}
