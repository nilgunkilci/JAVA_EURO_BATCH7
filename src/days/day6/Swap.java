package days.day6;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = a + b;
        a = c - a;
        b = c - a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
