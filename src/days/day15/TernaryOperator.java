package days.day15;

public class TernaryOperator {
    public static void main(String[] args) {
        int x, y;
        x = 20;
        y = (x == 1) ? 65 : 70;
        System.out.println("y = " + y);  // y=70

        y = (x == 20) ? 65 : 70;
        System.out.println("y = " + y); // y=65

        System.out.println("--------------------------------");

        boolean b;
        int a = 5;

        b = (a == 5) ? true : false;

        System.out.println("b = " + b);
    }
}
